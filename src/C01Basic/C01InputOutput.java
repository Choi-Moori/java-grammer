package C01Basic;

import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {

        final int taxi = 10000;
        final int bus = 3000;
        final int jarani = 2000;

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        if(money >= taxi){
            System.out.println("택시 추천");
        }
        else if (money >= bus){
            System.out.println("버스 추천");
        }
        else if(money >= jarani){
            System.out.println("킥보드 추천");
        }
        else
            System.out.println("걸으셩");
    }
}