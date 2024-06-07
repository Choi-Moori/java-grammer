package C01Basic;

public class C06String {
    public static void main(String[] args) {
        // 리터럴 방식
        String str = "abc";
        String str1 = "abc";
        
        // 객체생성
        String str2 = new String("abc");

        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }
}
