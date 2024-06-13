package C03Inheritance;

// class 에서는 중복상속을 허용하지 않는다
// why? : 상속된 2개의 부모 클래스에서 동일한 이름의 메소드를 가지고 있는 경우 충돌 가능성이 존재하기 때문.
// interface(인터페이스)는 중복 상속을 허용한다.
// why? 인터페이스는 선언만 하고 구현을 하지 않기때문에
// 인터페이스의 메소드를 사용하려면 무조건 오버라이딩(재정의)해 주어야 하기 때문에 충돌 가능성이 존재하지 않는다.
public class C0301Inheritance extends Parents{

//    인스턴스 변수여서 만약 static 메서드에서 사용하려면 static를 붙이거나,
//    new 로 객체를 생성하면 사용할 수 있다.
    int c = 30;

//    static 메서드는 인스턴스 변수를 사용할 수 없다.
    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
//        자식클래스라 하더라도 private변수는 상속 및 접근불가
        System.out.println(c1.a);
        System.out.println(c1.c);
//        메서드 상속
        c1.parentMethod();
    }

//    부모 메서드 재정의 "overriding"
//    성능의 최적화를 위해 붙여주는게 좋은것으로 알려져 있음. - 에너테이션
    @Override
    void parentMethod(){
        System.out.println("부모 클래스가 아니라 자식클래스 입니다.");
    }

    void childMethod(){
        System.out.println("자식 클래스입니다.");
    }
}

class Parents{
    //private : 같은 클래스 내에서만
    //public : 프로젝트 전체에서
    //default : 같은 패키지내에서
    //protect : 다른패키지더라도 상속관계면 가능
//    private < default < protect < public
    int a = 10;

    private int b = 20;

    void parentMethod(){
        System.out.println("부모 클래스입니다.");
    }

}
