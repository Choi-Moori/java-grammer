package C01Basic;

import java.lang.reflect.Type;
import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        map = dictionary와
//        Map<String, String > myMap = new HashMap<>();
//
//        myMap.put("soccer", "축구");
//        myMap.put("basketball", "농구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("soccer"));
//        myMap.put("baseball", "크리켓");
////        baseball을 map에서 검색하는 복잡도 O(1) (빅오 1 -> 1번의 연산으로 찾는다)
//        System.out.println(myMap.get("baseball"));
//
//        myMap.putIfAbsent("basketball", "배구");
//        System.out.println(myMap);
        // getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("baseball", "비어있음"));

//        String[] arr = {"농구", "농구","배구","야구","배구"};
//
//        Map<String, Integer> myMap = new HashMap<>();
//        for(String s : arr) {
//            myMap.put(s, myMap.containsKey(s) ? myMap.get(s) + 1 : 1);
//        }
//        System.out.println(myMap.get("a"));
//        System.out.println(myMap);

//        완주하지 못한 선수 - 프로그래머스
//        의상 - 프로그래머스

//        Map<String, Integer> linkedMap = new TreeMap<>();//LinkedHashMap<>();
//        linkedMap.put("hello5", 2);
//        linkedMap.put("hello4", 2);
//        linkedMap.put("hello3", 2);
//        linkedMap.put("hello2", 2);
//        linkedMap.put("hello1", 2);
//        System.out.println(linkedMap);
//        String[] st = {"abce", "abcd", "cdx"};
//        int num = 2;
//        Arrays.sort(st, (o1,o2) ->
//                o1.charAt(num) == o2.charAt(num)?
//                        o1.compareTo(o2) :
//                        o1.charAt(num)-o2.charAt(num));
//        System.out.println(Arrays.toString(st));

//        String객체 5개 정도 Stack추가후에 while 문을 통해 출력
//        Stack<String> stack = new Stack<>();
//
//        for(int i = 0 ; i < 5 ; i++)
//            stack.push("1");
//        while(!stack.isEmpty())
//            stack.pop();
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        answer.add(1);
//        answer.add(2);

//        deque

        Deque<Integer> d1 = new ArrayDeque<>();
        d1.add(10);
        d1.add(20);
        System.out.println(d1);
        d1.addFirst(30);
        System.out.println(d1);
        System.out.println(d1.peekFirst());
        System.out.println(d1.peekLast());
        System.out.println(d1.pollFirst());
        System.out.println(d1.pollLast());
        System.out.println(d1);


//        다리를 지나는 트럭
    }
}
