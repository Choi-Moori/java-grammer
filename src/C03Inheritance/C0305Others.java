package C03Inheritance;

import java.util.List;

// 상속 불가
//public class C0305Others extends FinalParents{
public class C0305Others{
    public static void main(String[] args) {
        AbstractDog dog = new AbstractDog();
//        추상클래스와 인터페이스는 구현없이 객체생성 불가
//        AbstractAnimal animal = new AbstractAnimal();
//        List<Integer> myList = new List<Integer>();
    }
}
final class FinalParents{

}

// 인터페이스는 모든 메서드가 추상메서드
// 추상클래스 하나라도 추상메서드가 있으면 추상메서드라 선언해줘야함
abstract class AbstractAnimal{
    void makeSound1(){
        System.out.println("동물 소리를 냅니다.1");
    }
//    메서드앞에 final이 붙으면 오버라이딩 불가
    final void makeSound2(){
        System.out.println("동물 소리를 냅니다.2");
    }
//    abstract키워드는 자시클래스로 하여금 오버라이딩 강제
//    abstract메서드가 하나라도 있으면 반드시 클래스에도 abstract키워드가 붙어야함
//    리턴타입과 매개변수만 정의
    abstract void makeSound3();
}

class AbstractDog extends AbstractAnimal{

    @Override
    void makeSound3(){
        System.out.println("멍멍3");
    }
    // 재정의 불가능
//    @Override
//    void makeSound2(){
//        System.out.println("멍멍2");
//    }

}