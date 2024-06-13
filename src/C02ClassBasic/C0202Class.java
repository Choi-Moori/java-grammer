package C02ClassBasic;
// 클래스를 통해서 객체를 만들 수 있음
// 객체 : 고유의 메모리값을 할당
// 즉 클래스로 복제본을 만든 거다
public class C0202Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10,20));
//        // A부서의 매출
//        // 20원 발생
//        MyCalculator.sumAcc(20);
//        System.out.println(MyCalculator.total);
//        // 30원 발생
//        MyCalculator.sumAcc(30);
//        System.out.println(MyCalculator.total);
//        // 40원 발생
//        MyCalculator.sumAcc(40);
//        System.out.println(MyCalculator.total);
//
//        //B부서의 매출 : 이렇게 하면 초기화하고 해야함 문제 있음
//        // 클래스 메서드 호출 방식 : 클래스명.메서드명();
//        MyCalculator.sumAcc(20);
//
//
//        // 객체를 사용한 회계 프로그램 : 객체 고유의 메모리 공간 할당
//        // A회사 매출
//        MyCalculatorInstance m1 = new MyCalculatorInstance(); // m1이라는 복제본을 하나 만듬
//        // 객체 메서드 호출 방식 : 객체.메서드명();
//        m1.sumAcc(10);
//        m1.sumAcc(20);
//        m1.sumAcc(30);
//        MyCalculatorInstance m2 = new MyCalculatorInstance();
//        m2.sumAcc(100);
//        m2.sumAcc(200);
//        m2.sumAcc(300);
//        System.out.println(m1.total);
//        System.out.println(m2.total); // 자기 각자 고유의 total 값을 가지게 된다.(static 이랑은 다름)
//        // static 넣고 안 넣고의 구분을 꼭 해라 : 클래스와 객체 - 메서드 호출 방식도 다름

        C0203Person person1 =new C0203Person();
        // 변수값에 직접 접근하여 값을 할당하는 방식
        // 따라서 권장하지 않는 방식..?
        // 의도가 불분명하고 직접 접근해서 값을 빼면 실수할 수 있다
//        person1.name = "홍길동";
//        person1.email = "홍길동@naver.com";
//        person1.age = 18;
//        person1.eating();
//        System.out.println("이름 : "+person1.name+"이메일은"+person1.email);
        // 일반적인 패턴은 변수값에 직접 접근하지 않는다.
        // 의도를 명확히한 메서드를 통해 변수값을 할당하고 가져옴.
        // 따라서 private을 붙여야함
        person1.setName("홍길동");
        person1.eating();

    }
}

class MyCalculator{
    static int total = 0;
    static int sum(int a, int b){
        return a+b;
    }
    static void sumAcc(int a){
        total+=a;
    }
}
class MyCalculatorInstance{
    // static이 붙어있는 변수는 클래스변수
    // static이 붙어있지 않는 변수는 객체변수
    int total = 0;
    int sum(int a, int b){
        return a+b;
    }
    void sumAcc(int total){
        this.total+=total;
    }


}
