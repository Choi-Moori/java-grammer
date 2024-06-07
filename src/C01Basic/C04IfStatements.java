package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하시는 서비스번호를 입력하세요");

        int input = sc.nextInt();

        // 1 : 대출업무 2 : 예금업무 3: 적금업무 0 :상담사 연결

        switch (input) {
            case 1:
                System.out.println("대출업무");
                break;
            case 2:
                System.out.println("예금업무");
                break;
            case 3:
                System.out.println("적금업무");
                break;
            case 0:
                System.out.println("상담사 연결");
                break;
            default:
                System.out.println("잘못된 입력");
        }
        
    }
}
