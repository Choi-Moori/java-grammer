package C07ExceptionFileParsing.AuthorException;
//  Author컨트롤러
//  - AuthorService service = new AuthorService();
//  - 1. 회원가입 : name, email, password 입력 객체 생성 후 service의 register
//  메서드 호출 -> service에서 Author 객체 생성하여-> repository호출하여 register완료
//  list에 담기
//      1-1. 회원가입 예외처리 => service에서 throw new 발생, controller try catch
//      (동일한 email 있는경우, 비밀번호가 5자리 이하인 경우)
//      - 2. 로그인 : email, password 입력받아 service의 login메서드 호출
//      - service에서 해당 email user가 있는지 검증.(없으면 예외).
import java.util.Scanner;

public class AuthorControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthorService authorService = new AuthorService();

        int num;
        System.out.println("1. 회원가입, 2. 로그인, 3.출력 0. 종료");

        while((num = Integer.parseInt(sc.nextLine())) != 0){
            switch (num){
                case 1:
                    System.out.print("이름\t\t: ");
                    String name = sc.nextLine();
                    System.out.print("이메일\t: ");
                    String email = sc.nextLine();
                    System.out.print("도메인\t: ");
                    String domain = sc.nextLine();
                    System.out.print("비밀번호\t: ");
                    String password = sc.nextLine();
                    try {
                        authorService.register(name, email+"@"+domain, password);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("이메일 입력\t: ");
                    email = sc.nextLine();
                    System.out.print("도메인 입력\t: ");
                    domain = sc.nextLine();
                    System.out.print("비밀번호 입력\t: ");
                    password = sc.nextLine();
                    try{
                        authorService.loginProcess(email+"@"+domain, password);
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    authorService.print();
                    break;

            }
            System.out.println("1. 회원가입, 2. 로그인, 3. 출력 0. 종료");
        }
    }
}
