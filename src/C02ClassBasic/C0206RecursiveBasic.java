package C02ClassBasic;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
//        adad(10);
        int i = 1;
        int j = 1;
        // 1 1 2 3 5
        for(int k = 2 ; k < 6 ; k++) {
            int num = i;
            i = j;
            j = num+i;
            System.out.print(j +" ");

        }

    }
    static void adad(int num){
        int total = 0;
        for(int i = 0 ; i < 10; i++){
            total += i;
        }
        System.out.println(total);
        System.out.println(addAcc(10));
    }

    static int addAcc(int n){
        return n+addAcc(n-1);
    }
}
