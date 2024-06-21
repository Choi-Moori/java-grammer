package C06EtcClass;

public class C0601Math {
    public static void main(String[] args) {
        // random() : 0.0 ~ 1.0 미만의 임의의 double형을 반환
//        double randomValue = Math.random();
//        System.out.println(randomValue);
//        for(int i=0;i<7;i++){
//            int random = (int)(Math.random()*100);
//            System.out.println(random);
//        }

        // abs() : 절대값 반환
//        System.out.println(Math.abs(-5));

        // ceil() : 올림
        // round() : 반올림
        // floor() : 내림
//        System.out.println(Math.round(5.67));

        // min, max
        System.out.println(Math.max(5,8));
        System.out.println(Math.min(5,8));

        // pow(a,b) : a의 b제곱
        System.out.println(Math.pow(5,2));

        // sqrt() : 제곱근
        System.out.println(Math.sqrt(25));
        //-- 소수 구하기 sqrt 활용
        int n=100;
        for(int i =0; i<(int)Math.sqrt(n) ;i++){
            if(n%i==0) {
                System.out.println("소수가 아닙니다");
                break;
            }
        }

    }
}
