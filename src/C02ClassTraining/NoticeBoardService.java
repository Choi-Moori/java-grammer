package C02ClassTraining;

import java.util.ArrayList;
import java.util.Scanner;

/* 게시판 서비스만들기
* 1. 회원가입
*   -> Author클래스 : id, name, email, password
* 2. 회원전체목록조회
*   -> id, email조회
* 3. 회원상세조회(by id로 조회)
*   -> id, name, email, password
* 4. 게시글작성
*   -> id, title, contents, email(입력받되, Author 객체)
* 5. 게시글목록조회
*   -> id, title
* 6. 게시글상세조회
*   -> id, title, contents, author_저자(email or name or author_id)
* */
public class NoticeBoardService {
    // List 를 리스트가 아닌 Map으로 하면 더 좋은 search가 가능
    // 각 객체가 리스트를 가져다 두면 확장성이 좋다.
    static ArrayList<Author> authorList = new ArrayList<>();
    static ArrayList<Post> postList = new ArrayList<>();
    static Long authorId = 1L;
    static Long postId = 1L;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        System.out.println("1. 회원가입, 2. 회원전체목록조회, 3. 회원상세정보조회, \n" +
                           "4. 게시글작성, 5. 게시글목록조회, 6. 게시글 상세조회 \n0. 종료");
        // a 에 입력을 받고 0이라면 while문 탈출
        while((a = Integer.parseInt(sc.nextLine())) != 0){
            play(a);
            System.out.println("\n1. 회원가입, 2. 회원전체목록조회, 3. 회원상세정보조회, \n" +
                    "4. 게시글작성, 5. 게시글목록조회, 6. 게시글 상세조회 \n0. 종료");
        }
    }
    // 기능 시작
    private static void play(int num){
        String name, email, password;
        switch (num) {
            case 1:
                System.out.println("이름 입력해주세요.");
                name = sc.nextLine();
                System.out.println("이메일을 입력해주세요");
                email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요.");
                password = sc.nextLine();
                register(name,email,password);
                break;
            case 2:
                printAllAuthor();
                break;
            case 3:
                System.out.println("조회를 원하는 회원 Id 입력 : ");
                printDetailAuthor(Long.parseLong(sc.nextLine()));
                break;
            case 4:
                System.out.println("게시글 제목");
                String title = sc.nextLine();
                System.out.println("게시글 내용");
                String content = sc.nextLine();
                System.out.println("Email 입력");
                email = sc.nextLine();
                Author au = findAuthor(email);
                if(au != null)
                    createPost(title, content, au);
                else
                    System.out.println("일치하는 email 정보가 없습니다.");
                break;
            case 5:
                printPost();
                break;
            case 6:
                System.out.println("조회를 원하는 Post Id 입력 : ");
                printDetailPost(Long.parseLong(sc.nextLine()));
                break;
        }
    }
    // 회원가입
    private static void register(String name, String email, String password){
        authorList.add(new Author(authorId++,name,email,password));
    }

    // 회원 전체목록 조회
    private static void printAllAuthor(){
        for(Author au : authorList){
            System.out.println("Id : " + au.getId() + " Email : " +au.getEmail());
        }
    }

    // 회원 상제조회 기능
    private static void printDetailAuthor(Long id){
        Author au = findAuthor(id);
        if(au != null) System.out.println("Id : " + au.getId() +
                                          "\nAuthorname : " + au.getName() +
                                          "\nAuthorEmail : " + au.getEmail() +
                                          "\nAuthorPassword : " + au.getPassword());
        else System.out.println("일치하는 Id 정보가 없습니다.");
    }
    // 상세 조회시 id로 회원 찾는 기능
    private static Author findAuthor(Long id){
        for(Author au : authorList){
            if (au.getId() == id) return au;
        }
        return null;
    }
    // 게시글 작성시 Email로 회원찾기
    private static Author findAuthor(String email){
        for(Author au : authorList){
            if(au.getEmail().equals(email)) return au;
        }
        return null;
    }
    
    // 게시글 작성
    private static void createPost(String title, String contents, Author email){
        postList.add(new Post(postId++,title,contents,email));
    }

    // 게시글목록조회
    private static void printPost(){
        for(Post post : postList){
            System.out.println("Id : " + post.getPostId() + " title : " + post.getTitle());
        }
    }

    // 게시글 상세 목록 조회
    private static void printDetailPost(Long id){
        Post post = findPost(id);
        if(post != null) {
            Author au = post.getEmail();
            if (au != null)
                System.out.println("Post Id : " + post.getPostId() +
                        "\ntitle : " + post.getTitle() +
                        "\ncontents : " + post.getContent() +
                        "\nAuthorId : " + au.getId() +
                        "\nAuthorname : " + au.getName() +
                        "\nAuthorEmail : " + au.getEmail());
            else{
                System.out.println("일치하는 email 정보가 없습니다.");
            }
        }
        else System.out.println("일치하는 PostId 정보가 없습니다.");
    }

    // 게시글 Id로 게시글 찾기
    private  static Post findPost(Long id){
        for(Post post : postList){
            if(post.getPostId() == id) return post;
        }
        return null;
    }
}

class Author{
    private final Long id;
    String name,email,password;

    Author(Long id, String name, String email, String password){
        this.id = id; this.name = name;
        this.email = email; this.password = password;
    }
    public Long getId() {return id;}
    public String getEmail() {return email;}
    public String getName() {return name;}
    public String getPassword() {return password;}
}

class Post{
    Long postId;
    String title, content;
    Author email;
    Post(Long postid, String title, String content, Author email){
        this.postId = postid;
        this.title = title;
        this.content = content;
        this.email = email;
    }
    public Long getPostId(){ return postId; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public Author getEmail() { return email; }
}