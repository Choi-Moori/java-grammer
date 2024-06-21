package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0603GenericMain {
    //generic 직접 만들기
    public static void main(String[] args) {
        String[] stArr = {"java", "python","C"};
        stChange(stArr,0,1);
        System.out.println(Arrays.toString(stArr));
        Integer[] intArr = {10,20,30};
        intChange(intArr,0,1);
        System.out.println(Arrays.toString(intArr));
        genericChange(stArr, 1,2);
        System.out.println(Arrays.toString(stArr));

        Person p1 = new Person();
        p1.setValue("park");

        // 클래스 선언도 중복 코드 안 하려면
        // Generic해서 하면 됨

        GenericPerson p2 = new GenericPerson<Integer>();
        p2.setValue(30);
        System.out.println(p2.value);

        // 제네릭 사용
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("java");

        // 컴파일 후 제네릭 소거
//        List myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("java");

    }
    static void stChange(String[] st, int before, int after ){
        if(before>st.length || after> st.length) System.out.println("다시 입력해주세요");
        String temp=st[before];
        st[before] = st[after];
        st[after]=temp;
        // 힙메모리에 저장되서 메모리주소를 던져주기 때문에 return 할 필요 없다
    }
    static void intChange(Integer[] intArr, int a, int b){
        int temp = intArr[a];
        intArr[a] = intArr[b];
        intArr[b]=temp;
    }
    // ------------ 위에 처럼 하면 코드가 중복이 있음(intChange랑 stChange)
    // ------------ 따라서 물음표 설계 like List<?>
    // 제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언
    // 유의점 : 제네릭은 객체 타입이 들어와야함
    static <T> void genericChange(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }

}
class Person{
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String value;
}
// 코드 중복을 막기 위해 타입도 넘겨주게 만드려면 제네릭
// 제네릭 클래스는 클래스명 옆에 <T> 선언
// 유의점 : 제네릭
class GenericPerson<T>{
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    T value;
}