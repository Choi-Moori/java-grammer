package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek());
//        System.out.println(myQue);
//        System.out.println(myQue.poll());
//        System.out.println(myQue);
//        ArrayBlockingQueue : 길이제한 큐
        Queue<String> queue = new ArrayBlockingQueue<>(3);
        queue.add("10");
        queue.add("20");
        queue.add("30");
//        queue.add("40");
        System.out.println(queue);

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(40);
        pq.add(50);
        pq.add(10);
        System.out.println(pq);
        while (!pq.isEmpty())
            System.out.println(pq.poll());

        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.add(20);
        deq.add(10);
        System.out.println(deq);

//      더맵게

        System.out.println(deq);

    }
}
