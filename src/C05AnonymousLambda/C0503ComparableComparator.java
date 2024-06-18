package C05AnonymousLambda;

import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) throws InterruptedException {
//        자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
//        Comparable 인터페이스에는 compareTo메서드 선언
//        Comparator 인터페이스에는 compare메서드 선언

        
//        String 클래스에 compareTo 내장(Comparable 구현)
//        
//        String a=  "hello";
//        String b = "horld";
//        System.out.println(b.compareTo(a));
//
//        Integer a1 = 10;
//        Integer a2 = 10;
//        System.out.println(a1.compareTo(a2));

//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList);   // Comparable의 compareTo메서드를 구현하여 정렬
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
        
//        Student객체 5개 정도 담으세요
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim", 24));
//        students.add(new Student("lee", 21));
//        students.add(new Student("park", 35));
//        students.add(new Student("choi", 15));
//        students.add(new Student("kim", 30));
//        Student객체에서 Comparable을 구현 -> compareTo메서드를 오버라이딩
//        Collections.sort(students);
//        for(Student s : students)
//            System.out.println(s.getName() + " " + s.getAge());
//        Comparator<Student> myComparator = (o1,o2) -> o1.age - o2.age;
//        o1.name.compareTo(o2.name);

//        students.sort((o2,o1) -> o1.age - o2.age);
//        System.out.println(students);
//        for(Student s : students)
//            System.out.println(s.getName() + " " + s.getAge());
        
//        아래 문자열을 글자길이 순서로 내림차순 정렬하여라
//        String[] stArr = {"hello", "java", "C++","world2"};
//        Arrays.sort(stArr, (s1,s2) -> s2.length() - s1.length());
//        System.out.println(Arrays.toString(stArr));
        
//        [4,1], [1,2], [5,0], [3,1]
//        위 배열이 들어간 아래 리스트를 배열에 0번째가 아닌 1번째를
//        기준으로 배열을 내림차순정렬
//        만약에 1번째가 같으면 0번째로 내림차순
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{4, 5});
//        myList.add(new int[]{1, 2});
//        myList.add(new int[]{5, 5});
//        myList.add(new int[]{3, 2});
//        myList.add(new int[]{3, 1});
//        myList.sort((o1,o2) -> {
//            if(o1[1] == o2[1]){
//                return o2[0] - o1[0];
//            }
//            return o2[1] - o1[1];
//        });
//        for(int[] i : myList)
//            System.out.println(Arrays.toString(i));
//
//
//        String[] stArr = {"hello", "java", "C++","world2"};
////        글자 길이 내림차순 pq
//        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length());
//        for(String s : stArr)
//            pq.add(s);
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("새로 생성한 쓰레드1 입니다.");
                }
            });
            t1.start();

            Thread t2 = new Thread(() -> {
                System.out.println("새로 생성한 쓰레드2 입니다.");
            });
            t2.start();
            new Thread(() -> System.out.println("새로 생성한 쓰레드3 입니다.")).start();
            System.out.println("main 쓰레드 입니다.");
            Thread.sleep(1000);
            System.out.println("-----------------------------------------");
    }
}
class Student /*implements Comparable<Student>*/{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //모든 클래스의 조상 클래스와 Object 클래스의 toString 메서드를 Overriding하여
// 객체 호출 시에 자동으로 toString 메서드호출
    @Override
    public String toString(){
        return "이름 :  + " + this.name + ", 나이 : " + this.age + "\n";
    }

//    @Override
//    public int compareTo(Student o) {
////        return this.name.compareTo(o.getName());
//        return this.age - o.getAge();
//    }
}