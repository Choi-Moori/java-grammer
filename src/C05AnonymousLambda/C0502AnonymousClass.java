package C05AnonymousLambda;

public class C0502AnonymousClass {
    public static void main(String[] args) {
//        AbstractAnimal상속한 클래스가 별도로 존재하지 않고,
//        익명의 클래스가 만들어짐과 동시에 익명객체 생성ㄴ
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound2() {

            }
        };

//        익명객체에 구현메서드가 1개밖에 없을때에 람다표현식(화살표함수)로 포현가능
//        ()부분에 매개변수를 지정하여 구현체에서 활용.
//        변수의 개수와 순서를 맞춰주어야 한다.
        Animal a2 = () -> System.out.println("동물소리를 냅니다.");

//        Animal2로 익명객체를 만들어서 input1+input2+input3을 더해서 return 하는 메서드 정의
//        위에서 return 문자열 출력.
//        실행문이 한줄 1일때는 {}와 return 생략 가능
        Animal2 a3 = (a,b,c) -> a+b+c;
        Animal2 a4 = (a,b,c) -> c>10?a+b:a;
//        2줄 이상일때는 {}를 사용해서 return 처리
        Animal2 a5 = new Animal2() {
            @Override
            public String makeSound(String a, String b, int c) {
                if(c>10) return a+b;
                else return a;
            }
        };
        System.out.println(a3.makeSound("hello", " world ",3));
        System.out.println(a5.makeSound("hello", " world",11));
    }
}
interface Animal {
    void makeSound();
}

interface Animal2 {
    String makeSound(String a, String b, int c);
}

abstract class AbstractAnimal {
    void makeSound1() {

    }
    abstract void makeSound2();
}