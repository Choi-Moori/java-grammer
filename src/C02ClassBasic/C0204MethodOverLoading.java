package C02ClassBasic;

public class C0204MethodOverLoading {
    public static void main(String[] args) {
        C0204MethodOverLoading c02 = new C0204MethodOverLoading();

        System.out.println(c02.sum(10,20));
        System.out.println(c02.sum(10.0,20));
        System.out.println(c02.sum(10,20,30));
    }

//    접근제어자를 안붙이면 기본적으로 default접근제어자 : 같은패키지내 유효
    int sum(int a, int b){
        return a+b;
    }
//    매개변수의 타입 또는 개수가 다르면, 같은 이름의 메소드 정의가능 즉, 메서드 오버로딩
    int sum(int a,int b, int c){
        return a+b+c;
    }
    double sum(double a, double b){
        return a+b;
    }

}
