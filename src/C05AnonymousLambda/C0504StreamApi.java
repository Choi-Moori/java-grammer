package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamApi {
//  람다표현식(화살표함수)
//    1.익명객체
//    2.함수형프로그래밍(StreamApi)
    public static void main(String[] args) {
//        int[] arr = {20,10,4,12};
        
//        전통적인 방식의 데이터 접근방식
//        for(int i : arr){
//            System.out.println(i);
//        }

//        함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        데이터의 안정성 향상
//        java에서 함수형프로그래밍을 지원하기 위한 라이브러리가 streamAPI
//        foreach : 스트림의 각 욧를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));

//        스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
//        stream<클래스명> : 제네릭타입으로 stream객체가 생성
//        Stream<String> stream1 = Arrays.stream(stArr);
//        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        Stream<String> stream2 = stList.stream();
//
//        int[] intArr = {10,20,30,40,50};
//        기본 자료형은 별도의 stream 제공
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        Stream<Integer> stream4 = myList.stream();
//        오류가 발생한다. why?
//        int가 아니라 Integer이기 때문에 Intstream은 사용 불가
//        IntStream stream5 = myList.stream();
        
//        stream 변환(중개연산) : filter, map, sorted, distinct, limit
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
//        filter : 특정기준으로 대상을 filtering하는 것
//        stream<String>을 반환
//        참조변수의 스트림변환의 경우 제네릭의 타입소거 문제 발생
//        제네릭의 타입소거란 제네릭타입을 런타입시점에는 제거하는 것을 의미한다.
//        그래서, 타입이 소거된 Stream객체에서 배열로 변환하려면 타입이 뭔지 명시해 주어야 한다.(타입캐스팅)
//        String[] newStArr = Arrays.stream(stArr).filter(a->a.length() <= 4).toArray(a -> new String[a]);
//        메소드 참조 방식(매개변수가 추론가능할때 생략하는 형식) : 클래스::메서드
//        String[] newStArr2 = Arrays.stream(stArr).filter(a->a.length() <= 4).toArray(String[]::new);
//        두개가 같다
//        Arrays.stream(stArr).forEach(System.out::println);
//        Arrays.stream(stArr).forEach(a-> System.out.println(a));

//        int[] intArr = {10,10,30,40,50};
//        int[] newIntArr = Arrays.stream(intArr).filter(a->a <= 30).toArray();
//        System.out.println(Arrays.toString(newIntArr));
//        int[] newIntArr2= Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newIntArr2));
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//
////        map : 기존의 스트림을 조작하여 새로운 스트림 반환
//        int[] newMapArr =Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr));

//        int[] arr1 = {1,2,3,4,5,6};
//        int[] newArr1 = Arrays.stream(arr1).filter(a->a%2!=0).toArray();
//        int[] newArr2 = Arrays.stream(arr1).filter(a->a%2!=0).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(newArr1));
//        System.out.println(Arrays.toString(newArr2));
////        홀수만 담은 배열의 값을 제곱한 새로운 배열 오름차순 정렬 생성 : filter, map , sorted
//        int[] newArr3 = Arrays.stream(arr1).filter(a->a%2!=0).map(a->a*a).sorted().toArray();

//        mapToInt : intstream형태로 변환해주는 map
//        String[] stArr = {"HTML","CSS","JAVASCRIPT","JAVA"};
//        각 문자열의 길이를 담은 새로운 int배열 생성
//        int[] intArr = Arrays.stream(stArr).mapToInt(String::length).toArray();
//        int[] intArr2 = Arrays.stream(stArr).mapToInt(String::length).limit(3).toArray();
//        System.out.println(Arrays.toString(intArr));
//        System.out.println(Arrays.toString(intArr2));


//        스트림의 소모 -> sum:합계, reduce:누적합계, foreach(출력) 등
//        int[] intArr3 = {10,20,30,40};
//        Arrays.stream(intArr3).forEach(System.out::println);
//        int intArrSum = Arrays.stream(intArr3).sum();
//        System.out.println(intArrSum);
//        optional객체 : 값이 있을수도 있고, 없을수도 있음을 명시한 객체
//        int intArrMax = Arrays.stream(intArr3).max().getAsInt();
//        int intArrMin = Arrays.stream(intArr3).min().getAsInt();
//        reduce(초기값, 연산식);
//        int intArrCount = (int)Arrays.stream(intArr3).count();
//
//        int allMultiply = Arrays.stream(intArr3).reduce(1,(a,b) -> a*b);
//        int allAdd = Arrays.stream(intArr3).reduce(0, (a,b) -> a+b);
//        System.out.println("최대값 " + intArrMax);
//        System.out.println("최소값 " + intArrMin);
//        System.out.println("개수 " + intArrCount);
//        System.out.println("누적곱 " + allMultiply);
//        System.out.println("누적합 " + allAdd);
//        int[] testArr = {10,10,20,20,20,30};
//        int[] answer = Arrays.stream(testArr).distinct().toArray();


//        findFirst
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim", 20));
//        students.add(new Student("choi", 32));
//        students.add(new Student("lee", 35));
//        students.add(new Student("park", 22));
        
//        나이가 30이 넘는 학생중에 첫번째 index값을 가지는 학생 객체 생성
//        get이 없으면 오류
//        Student s1 = students.stream().filter(a->a.getAge() >= 30).findFirst().get();
//        System.out.println("30이상인 첫번째 index : " + s1.getName() + " " + s1.getAge());
//        student객체 실습
//        1)모든 객체의 평균나이
//        2)가장 나이 어린 사람 찾기
//        3)30대가 몇명인지 출력 -> 의 이름을 String배열에 담기
//        int averageAge = (int) students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
//        System.out.println("평균나이 : " + averageAge);
//        Student s2 = students.stream().sorted((a,b) -> a.getAge()-b.getAge()).findFirst().get();
//        System.out.println("s2의 이름과 나이 : " + s2.getName() + " " + s2.getAge());
//        int countthr = (int) students.stream().filter(a->a.getAge() >= 30).count();
//        System.out.println("30대가 몇명인가? : " + countthr);
//        String[] countth = students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(String[]::new);
//        System.out.println("30대인 사람의 이름을 담은 배열 : " + Arrays.toString(countth));

//        Optional객체 : 특정객체에 값이 없을지도 모른다는 것을 명시적으로 표현.
//        만약 Optional 객체를 만난다면 null이 있을 수도 있다고 생각하고 작성하자 - 심리적 2중장치
//        ofNullable : null이 있을수도 있는 경우에 Optional객체를 생성하는 메서드
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1 = null;
//
//        if(opt1.isPresent()) {
//            System.out.println(opt1.get().compareTo("hello"));
//        }
//        else {
//            System.out.println("값이 없습니다.");
//        }
//
//        Optional<String> opt1 = Optional.empty();
//        Optional<String> opt2 = Optional.of("hello");   // null이 못들어감
//        Optional<String> opt3 = Optional.ofNullable(null);   // null이 들어갈 수 있다.
//        Optional<String> opt4 = Optional.ofNullable("hello");

//        사용자가 직접 Optional객체를 만들일은 거의 없음.
//        return 타입이 Optional객체인 메서드를 사용했을 때 어떻게 할 것인가?

//        Optional객체 처리 방법 4가지
//        방법1. isPresent() 확인후 get()
//        if(opt3.isPresent())
//            System.out.println(opt3.get().length());
//        방법2. orElse() : 값이 있으면 있는 값 return, 없으면 지정값 return
//        System.out.println(opt3.orElse("").length());
//        방법3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행
//        System.out.println(opt3.orElseGet(()->new String("")).length());
//        System.out.println(opt4.orElseGet(()->new String("")).length());
//        방법4. orElseThrow() : 가장 중요. 값이 있으면 있는값 return, 없으면 지정된 예외 강제 발생
//        개발에서 예외를 사용자에게 적절한 메시지 전달 목적으로 강제 발생시키는 경우가 존재.
//        System.out.println(opt3.orElseThrow(()-> new NoSuchElementException("값이 없습니다.")).length());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("kim1", 21));
        students.add(new Student("kim2", 23));
        students.add(new Student("kim3", 25));
//        방법1
        OptionalDouble answer = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average();
        if(answer.isPresent()){
            System.out.println(answer.getAsDouble());
        }else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer);
//        방법2
        double answer2 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));
    }
}
