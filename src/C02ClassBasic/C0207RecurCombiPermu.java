package C02ClassBasic;

import java.util.Arrays;

public class C0207RecurCombiPermu {
    static int exnum = 5, r = 3;
    static int[] num = new int[r];
    static boolean[] visit = new boolean[exnum+1];
    public static void main(String[] args) {
        System.out.println("순열");
        permutation(0);
        System.out.println("조합");
        combinations(0,1);
    }
    static void permutation(int count){
        if(count == r){
            System.out.println(Arrays.toString(num));
            return;
        }
        for(int i =1; i <= exnum ; i++){
            if(visit[i] == false){
                visit[i] = true;
                num[count] = i;
                permutation(count+1);
                visit[i]=false;
            }
        }
    }
    static void combinations(int count, int start){
        if(count == r){
            System.out.println(Arrays.toString(num));
            return;
        }
        for(int i =start; i <= exnum ; i++){
            if(visit[i] == false){
                visit[i] = true;
                num[count] = i;
                combinations(count+1, i+1);
                visit[i]=false;
            }
        }
    }
    //        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> myList2 = new ArrayList<>();
////        myList로 만들수 잇는 2개짜리 숫자조합을 2차원에 담기
//        for(int i = 0 ; i < myList.size() ; i++){
//            for(int j = i ; j < myList.size();j++){
//                if(i != j)
//                    myList2.add(combine(myList.get(i),myList.get(j)));            }
//        }
//        System.out.println(myList2);

//    public static List<Integer> combine(int a, int b){
//        List<Integer> list = new ArrayList<>();
//        list.add(a);
//        list.add(b);
//        return list;
//    }
}
