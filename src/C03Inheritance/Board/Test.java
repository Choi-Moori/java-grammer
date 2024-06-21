package C03Inheritance.Board;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while(true){
            System.out.println("원하시는 서비스번호 입력 1.회원가입 2.게시글등록");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());


        }
    }
}


class Author {
    private String name;
    private String email;
}