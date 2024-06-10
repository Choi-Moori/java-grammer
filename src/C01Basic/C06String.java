package C01Basic;

import javax.sound.midi.Soundbank;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
        // 리터럴 방식
//        String str = "abc";
//        String str1 = "abc";
        
        // 객체생성
//        String str2 = new String("abc");
//
//        System.out.println(str == str1);
//        System.out.println(str == str2);
//        System.out.println(str.equals(str2));
        // 문자열 비교는 equals
//        String st1 = new String("hello");
//        String st2 = "hello";
//        String st3 = new String("hello");
//        String st4 = "hello";
//        System.out.println(st1 == st2);
//        System.out.println(st2 == st4);
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st3.equals(st4));


//        문자열길이 : length();
//        String st1 = "hello java world";
//        System.out.println(st1.length());
//        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        int index1 = st1.indexOf("java");
//        System.out.println(index1);
//
//        String st = "abcdefabaadf";
//        char ch1 = st.charAt(0);
//        char ch2 = st.charAt(6);
//        int count = 0;
//        for(int i = 0 ; i <st.length(); i++){
//            if(st.charAt(i) == 'a') count++;
//        }
//        System.out.println("a의 개수 " + count);
//
//        String[] st5 = new String[]{Arrays.toString(st.toCharArray())};
//        int count1 = 0;
//        for(String i : st5)
//            if(i.equals("a")) count++;
//        System.out.println("" +count);
//
//        String myst = "abcdef";
//        List<String> myst1 = Arrays.asList(myst.split(""));
//
//        System.out.println(myst1);

//        String st1 = "hello world";
//        System.out.println(st1.substring(st1.indexOf("w") , st1.length()));
//        String trimSt1 = " hello world     ";
//        String trimSt2 = trimSt1.trim();
//        System.out.println(trimSt1);
//        System.out.println(trimSt2);
//        String trimSt3 = trimSt1.strip();
//        System.out.println(trimSt3);

//        String st1 = "01abc123한글123";
//        // for문 활용해서 알파벳(소문자) 제거 answer return
//        for(int i = 0 ; i < st1.length(); i++){
//            if(st1.charAt(i) < 'a' || st1.charAt(i) > 'z')
//                System.out.print(st1.charAt(i) + "");
//        }

//        String st1 = "01abc123한글123";
//        // [a-z]+ : 1개이상의 소문자 알파벳 표현하는 정규표현식;
//        // [A-Za-z]+ : 대소문자 포함
//        // [가-히]+ : 한글
//
//        String answer = st1.replaceAll( "[A-Za-z]", "");
//        System.out.println(answer);

//        String s = "123465";
//        System.out.println(Pattern.matches("[0-9]{4}+", s));

//        전화번호 검증
//        while(true){
//            Scanner sc = new Scanner(System.in);
//            String number = sc.nextLine();
//            if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number))
//                System.out.println("올바르게 입력하셨습니다.");
//            else System.out.println("틀린 형식");
//        }
//        이메일 검증 : 소문자알파벳,숫자id@알파벳.com
//        String s = "abc123@naver.com";
//        boolean b3 = Pattern.matches("^[a-z0-9]+@+[a-z]+.com$",s);
//        System.out.println(b3);
//        String b = "a b c  d";
//        // \\s : 공백
//        String[] b_arr = b.strip().split("\\s+");
//        System.out.println(Arrays.toString(b_arr));
//
//        isEmpty와 null(자료타입)
//        String st1 = null;
//        String st2 = "";
//
//        System.out.println(st2.isEmpty());
//        if(st1 != null)
//            System.out.println(st1.isEmpty());

//        String[] arr = {"java", "python", "C++","javascript"};
//        String st = String.join(" ", arr);
//        System.out.println(st);

//        StringBuffer sb1 = new StringBuffer("hello");
//        sb1.append(" java");
//        sb1.append(" world");
//        sb1.insert(5, " python");
//        sb1.delete(17, sb1.length());
//        System.out.println(sb1);
//        String answer = sb1.toString();
//
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("hello");
//        sb2.append("\n");
//        sb2.append("world");

//        StringBuilder를 사용해서
//        String my_string ="hello";
//        int n = 3;
//        StringBuilder sb3 = new StringBuilder();
//
//        for(String i : my_string.split(""))
//            sb3.append(i.repeat(3));
        // 또는
        //  for(int j = 0 ; j < 3 ; j++) sb3.append(i);

        String A = "hello", B = "ohell";
        int num = A.length();
        for(int i = 1 ; i < num; i++){
            if((A.substring(num-1,num)+A.substring(0, num-1)).equals(B)){
                System.out.println(i);
                break;
            }
        }
    }
}
