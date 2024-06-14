package C05AnonymousLambda;

import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {
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
        String[] stArr = {"hello", "java", "C++","world2"};
        Arrays.sort(stArr, (s1,s2) -> s2.length() - s1.length());
        System.out.println(Arrays.toString(stArr));

//        [4,1], [1,2], [5,0], [3,1]
        List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{4, 1});
        myList.add(new int[]{1, 2});
        myList.add(new int[]{3, 0});
        myList.add(new int[]{3, 2});
        myList.add(new int[]{3, 1});

        myList.sort((o1,o2) -> {
            if(o1[0] == o2[0]){
                return o2[1] - o1[1];
            }
            return o2[0] - o1[0];
        });
//        for(int[] i : myList)
//            System.out.println(Arrays.toString(i));

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