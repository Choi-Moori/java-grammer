package C02ClassBasic;

public class C0201MethodPractice {
//    어떤 숫자값이 소수인지 아닌지를 판별하는 메서드 생성
//    => 리턴타입은 boolean, 매개변수는 int 숫자

//    main메서드 안에서 해당 메서드 호출해서 판별 출력
    public static void main(String[] args) {
        System.out.println(isPrime(97));
    }
    public static boolean isPrime(int num){
//        소수 = true, 소수X = false
        boolean res = true;
        for(int i = 2 ; i*i < num; i++){
            if(num % i == 0) {
                return false;
            }
        }

        return res;
    }

}
