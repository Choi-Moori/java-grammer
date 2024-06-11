package C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
//        ArrayList<String> myList1 = new ArrayList<>();
//        ArrayList<Integer> myList2 = new ArrayList<>();
//
////        가장일반적인 List선언 방법
////        왼쪽엔 인터페이스, 오른쪽엔 구현체(클레스)
//        List<String> myList3 = new ArrayList<>();
//        // 특정 리스트의 요소를 모두 add
//        ArrayList<Integer> myList = new ArrayList<>();
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(40);
//
//        myList.addAll(myList2);
//        System.out.println(myList);
//
////        get : 특정 위치의 요소를 반환
////        System.out.println(myList.get(0));
//
//        for(int i = 0 ; i < myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//
//        myList.set(myList.size()-1, 10);
//        System.out.println(myList);
//
////        indexOf : 특정값이 몇번째 index에 위치한지 return.
////        가장 먼저 나오는값의 index return.
//
//        System.out.println(myList.indexOf(10));
//
//        // 전체 삭제 : clear()
////        isEmpty() : 값이 비었는지, 안 비었는지
//        List<Integer> list = new ArrayList<>();
//        System.out.println(list.isEmpty());
//        list.add(10);
//        System.out.println(list.contains(20));

//        List<List<Integer>> myList = new ArrayList<>();
//
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//
//        myList.get(0).add(1);
//        myList.get(1).add(1);
//        System.out.println(myList);
//
//        List<int[]> myList2 = new ArrayList<>();
//        int k = 1;
//        for(int i = 0; i < 3; i++){
//            myList2.add(new int[i+2]);
//        }
//        myList2.add(new int[2]);
//        myList2.add(new int[3]);
//        myList2.add(new int[]{1,2});
//        myList2.add(new int[]{1,2,3});
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//        System.out.println("정렬 전 : " + myList);
////        정렬1.Collections.sort()
//        Collections.sort(myList);
//        System.out.println("오름차순 정렬 후 : " + myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println("내림차순 정렬 후 : " + myList);
////        정렬2.리스트객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println("오름차순 정렬 후 : " + myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println("내림차순 정렬 후 : " + myList);
//

//        배열과 List간의 변환
//        1.String배열을 List<String>로 변환
//        String[] stArr = {"java", "python", "C++"};
////        1-1.Arrays.asList
//        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
////        1-2.for문을 통해 담기
////        1-3.streamApi(참고만)
//        List<String> stList2 = Arrays.stream(stArr).collect(Collectors.toList());
//
////        2.List<String>을 String배열로 변환
////        2-1.for문을 통해 담기
////        2-2.toArray
//        String[] stArr2 = stList1.toArray(new String[stList1.size()]);
//
////        3.int배열을 List<Integer>로 변환
////        3-1.for문을 통해 담기
////        3-2.streamApi사용
//        int[] intArr = {10,20,30,40};
//        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

//        ----------------------------6/11---------------------------------------------
//        <> -> 아무 타입이나 올 수 있다 (int, String, Object 뿐 아니라
//        내가 만든 클래스 도 들어올 수 있다.
    }
}
