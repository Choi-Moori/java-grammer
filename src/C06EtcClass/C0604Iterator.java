package C06EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C0604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        //enhanced for 문 : 원본변경불가
        for(String a: myList) System.out.println(a);

        // iterator는 참조하고 있는 원본데이터 삭제 가능 <---- by remove()
        // iterator 많이 사용하지는 않지만
        // return 타입으로 iterator 주면 써야하니까 알아두기
        Iterator<String> iters2 = myList.iterator();
        while(iters2.hasNext()){
            if(iters2.next().equals("banana")) iters2.remove();
        }
        System.out.println(myList);

    }
}
