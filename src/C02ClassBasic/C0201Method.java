package C02ClassBasic;

public class C0201Method {
    public static void main(String[] args) {
//        메소드를 배우는 이유
//        1~10까지의 총합 구하기 - for문으로
        int total = 0;
        for(int i = 1; i <= 10 ; i++){
            total+=i;
        }
        total = 0;
        for(int i = 10 ; i <= 20; i++){
            total+=i;
        }
//        코드 중복이 발생, 반복을 피하기 위해 위 기능 분리
        System.out.println(sumAcc(1,10));

//        클래스명.메서드 : 기본방식
//        같은 클래스내에서의 클래스메서드 호출은 클래스명 생략가능

    }

//    int 라는 return 타입을 가짐
//    input(매개변수) 값을 int 2개로 정의
// 메서드 구성요소 : 매개변수, 리턴타입(리턴 타입이 없으면 void), 접근제어자(public), 클래스 메서드 여부(static)
    public static int sumAcc(int start, int end){
        int total = 0;
        for(int i = start ; i <= end ; i++)
            total += i;
        return total;
    }


}
