package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;
//*을 통해 패키지내에 모든 클래스 import 가능
//*을 통해 패키지내에 패키지까지 포함해서 모든 내용 import는 불가능


public class ProtectedMain extends C0304ProtectedClass {
    // public 됨, default 안됨 : 다른패키지
    // private 안됨
    // protected 안됨 ->
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
//        default접근 불가
//        System.out.println(c1.st2);
//        protected접근 불가
//        System.out.println(c1.st3);

        ProtectedMain p1 = new ProtectedMain();
        //deqfult 접근 불가
        // System.out.println(p1.st2);
        // 상속한 객체에서 protected접근 가능
        System.out.println(p1.st3);

    }
}
