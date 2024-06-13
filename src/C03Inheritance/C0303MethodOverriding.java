package C03Inheritance;

public class C0303MethodOverriding {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();

//        상속 관계일때 부모 클래스 타입을 자식 클래스 객체의 타입으로 지정가능
//        animal클래스에 정의된 메서드만 사용가능하도록 제약 발생
        Animal myDog2 = new Dog();
//        myDog2.sound2(); //컴파일 에러 발생
    }

}
class Animal{
    void sound(){
        System.out.println("동물은 소리를 냅니다.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("야옹");
    }
}