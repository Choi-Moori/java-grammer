package C05AnonymousLambda;

public class C0501InnerClass {
    MemberInnerClass.StaticInnerClass m1 =
            new MemberInnerClass.StaticInnerClass();

}

class MemberInnerClass{
    int a;
    void display(){
        System.out.println("a의 값은" +a);
    }
    static class StaticInnerClass{
        int b;

        void display(){
            System.out.println("b의 값은" +b);
        }
    }
}

