package C01Basic;

public class C1102StackFunction {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        function1(1);
        System.out.println("main함수 끝");
    }

    static int function1(int a){
        System.out.println("function1함수 시작" + a);
        System.out.println("function1함수 끝");
        return function1(a+1);
    }
}
