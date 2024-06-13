package C03Inheritance;

public class C0302SuperChildClass extends SuperParents{
    int a;

    int c;

    C0302SuperChildClass(){
//        super() : 부모클래스의 생성자를 의미
//        super.변수명 : 부모클래스의 변수명 의미
        super(30);
        a = 10;
        c = 20;
    }

    public static void main(String[] args) {
        C0302SuperChildClass c1 = new C0302SuperChildClass();
        c1.dispaly2();

    }

    void dispaly2(){
        System.out.println(a);
        System.out.println(super.a);
    }

}


class SuperParents{

    int a;

    SuperParents(int a){
        this.a = a;
    }
    void display(){
        System.out.println("부모클래스입니다.");
    }

}