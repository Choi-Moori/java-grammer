package C01Basic;

import java.util.Scanner;

public class C05LoopStatemets {
    public static void main(String[] args) {

//        int a = 0;
//
//        while(a<10){
//            System.out.println("hello world " + a);
//            a += 1;
//        }

//        int a = 1;
//        while(a++<11){
//            System.out.println(a);
//        }

//        입력한 숫자의 구구단 단수 출력

        Scanner sc = new Scanner(System.in);
//        int num;
//        while ((num = sc.nextInt()) != 0){
//            int i = 0;
//            while (i++ < 9) {
//                System.out.println(num + " * " + i + " = " + num * i);
//            }
//            System.out.println("---------------------");
//        }

//        int answer = 1234;
//        int input , count = 1;
//        while ((input = sc.nextInt()) != answer){
//            System.out.println("비밀번호가 틀렸습니다. ");
//            count++;
//            if(count > 5){
//                break;
//            }
//        }
//        System.out.println(count > 5 ? "입력 5회 초과" : "문이 열렸습니다");
//
//        int num = 1234;
//        int result  = 0;
//        while(num != 0){
//            int digit = num % 10;
//            result = result * 10 + digit;
//            num /= 10;
//        }
//
//        System.out.println(result);

//        int num = 0;
//        for (int i = 0 ; i <= 20 ; i+=2){
//            num+=i;
//        }
//        System.out.println(num);

//        int a = 24, b = 36;
//        int num = 0;
//        for(int i = 1 ; i <= a; i++){
//            if(a%i == 0 && b%i == 0)
//                num = i;
//        }
//        System.out.println(num);
//        System.out.println("".join(" ", result));
//        int i;
//        int j;
//        int num = sc.nextInt();
//        System.out.print("소수 : 2 3 ");
//        for(i = 4 ; i <= num; i++){
//            for(j = 2; j <= i ; j++){
//                if(i % j == 0) break;
//            }
//            if(i == j){
//                System.out.print(i + " ");
//            }
//        }
//

        int[][] arr = {{1,2,3} , {4,5,11} , {7,8,9} , {10,11,12}};
        int target = 11;
        Loop1:
        for(int i = 0 ; i < arr.length ; i++)
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target) {
                    System.out.println(i + " " + j);
                    break Loop1;
                }
            }
    }
}
