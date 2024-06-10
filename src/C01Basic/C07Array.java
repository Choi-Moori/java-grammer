package C01Basic;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        // 배열 표현식1 : 리터럴 방식
//        int[] intArr = {1,2,3,4,5};
//
//        // 배열 표현식2 : 참조방식
//        int[] intArr2 = new int[5];
//
//        intArr2[0] = 1;
//        intArr2[1] =2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); // 0으로 초기화
//        for(int i = 0 ; i <  intArr2.length ; i++){
//            System.out.println(intArr2[i]);
//        }
//
//        // 85, 65, 90인 int 배열을 선언하고, 총합, 평균을 구해보자.
//        int[] intArr3 = new int[]{85,65,90};
//        int sum = 0;
//        for (int j : intArr3) {
//            sum += j;
//        }
//        System.out.println("총합 : " + sum + ", 평균 : " + sum/intArr3.length);
//
//
//        // 배열 표현식3
//        int[] intArr3 = new int[]{1,2,3,4};
//        System.out.println(intArr3.length);
//
//        // 배열 표현식4 : 불가능하다 -> 배열의 길이는 사전에 정의가 필요
//        int[] intArr4 = new int[];

//        String[] stArr = new String[5];
//        stArr[0] = "hello";
//        stArr[1] = "java";
//
//        String[] stArr2 = new String[5];
//        // 배열에 값 한꺼번에 세팅
//        Arrays.fill(stArr2, "");
//        System.out.println(stArr2[3]);

//        배열의 최대 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int ma = arr[0], mi = arr[0]; // Integer.MIN_VALUE로도 세팅 가능, Integer.Max_VALUE로 세티 가능
//
//        System.out.println(Long.MIN_VALUE + " " +  Long.MAX_VALUE);
//        for(int i : arr){
//            ma = ma>i ? ma : i;
//            mi = mi<i ? mi : i;
//        }
//        System.out.println(ma +  " " + mi);
//        배열의 순서 바꾸기
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//
//        int[] arr2 = {10,20,30,40,50};
//        // 0번째 index부터 마지막 index까지 순차적으로 자리 change
//        for(int i = 0 ; i < arr2.length-1; i++){
//            temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

//        // 배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        // 새로운 배열에 위 arr을 뒤집은 값 세팅
//        int num = arr.length;
//
//        int[] arr2 = new int[num];
//
//        for(int i = num-1; i >= 0; i--){
//            arr2[(num-1)-i] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(arr2));

//      숫자 뒤집기
//        int num = 1234;
//        //문자배열로 만들고 문자열로 합해서 문자열로 출력
//        String str = String.valueOf(num);
//        StringBuilder res = new StringBuilder();
//        for(String i : str.split(""))
//            res.insert(0, i);
//        System.out.println(res.toString());

//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        // 문자정렬
//        // 문자 정렬은 아스키 코드
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        System.out.println(Arrays.toString(fruits2));
//      기본형타입은 Comparator로 처리 불가
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr);
//        System.out.println("오름차순 정렬 : " + Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println("내림차순 정렬 : " + Arrays.toString(st_arr));

//        int[] intArr = {5,1,2,7,3,1,2};
//        // 먼저 int 배열을 정렬
//        Arrays.sort(intArr);
//        System.out.println("오름차순 정렬 : " + Arrays.toString(intArr));
//        // int 배열을 String 배열에 넣어준다.
//        String[] stringArray = new String[intArr.length];
//        for (int i = 0; i < intArr.length; i++) {
//            stringArray[i] = String.valueOf(intArr[i]);
//        }
//
//        // String 배열을 뒤집은 다음 int 형으로 다시 반환하여 int 배열에 넣어준다
//        Arrays.sort(stringArray, Comparator.reverseOrder());
//        for(int i = 0 ; i < intArr.length; i++){
//            intArr[i] = Integer.parseInt(stringArray[i]);
//        }
//        System.out.println("내림차순 정렬 : " + Arrays.toString(intArr));
        // 오름차순 정렬 후 배열 뒤집기
        // 방법 1. 오름차순 정렬후 배열 뒤집기

        // 방법 2. streamapi, lambda를 활용한 내림차순 정렬
//        int[] answer = Arrays.stream(intArr)// intArr를 대상으로 stream 형식으로
//                .boxed() // int요소를 Integer로 형변환 시키는 메서드
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(a->a) // Integer를 int로 형변환
//                .toArray();
//        System.out.println("내림차순 정렬 : " + Arrays.toString(answer));

//        int[] arr = {17,20,19,25,12};
//        int temp;
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = i+1 ; j < arr.length ; j ++){
//                temp = arr[i];
//                if(temp > arr[j]){
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int i : arr)
//            System.out.print(i  + " ");

        // 숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을때,
        // 만들어질수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10,20,30,40,50,60};
//        for(int i = 0 ; i < intArr.length ; i++){
//            for(int j = i+1 ; j < intArr.length;j++){
//                System.out.print(intArr[i] + intArr[j] + " ");
//            }
//            System.out.println();
//        }
////        배열의 복사 : copyOf(배열, end), copyOfRange(배열, start, end)
//        int[] arr = {10,20,30,40,50};
//        int[] newArr1 = Arrays.copyOf(arr, 10);
//        System.out.println(Arrays.toString(newArr1));
//
//        int[] newArr2 = Arrays.copyOfRange(arr,1,4);
//        System.out.println(Arrays.toString(newArr2));
//
//        배열의 중복 제거
//        int[] temp = {10,10,5,7,40,40,10,10};
//        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));
//        int num = 0;
//        int[] res = new int[temp.length];
//        for(int i = 0 ; i < temp.length ; i++){
//            if(i == 0 || temp[i] != temp[i-1]) {
//                res[num] = temp[i];
//                num++;
//            }
//        }
//
//        res = Arrays.copyOf(res, num);
//        System.out.println(Arrays.toString(res));

//        int[] numbers = {5,0,2,7    };
//            int[] answer1 = new int[25];
//            int num = 0;
//            Arrays.sort(numbers);
//            for(int i = 0 ; i < numbers.length ; i++){
//                for (int j = i+1 ; j < numbers.length ; j++){
//                    answer1[num] = numbers[i] + numbers[j];
//                    num++;
//                }
//            }
//            answer1 = Arrays.copyOf(answer1, num);
//            Arrays.sort(answer1);
//            num = 0;
//            int[] answer = new int[answer1.length];
//            for(int i = 0 ; i < answer.length ; i++){
//                if(i == 0 || answer1[i] != answer1[i-1])
//                    answer[num++] = answer1[i];
//            }
//            answer = Arrays.copyOf(answer, num);
//            System.out.println(Arrays.toString(answer));

//        int[] arr = {5,3,1,8,7};
//
//        for(int i = 0 ; i < arr.length ; i++)
//            if(arr[i] == 8){
//                System.out.println(i);
//                break;
//            }

//        int[][] arr2 = {{1,2,3}, {4,5,6}};
//        이차원 배열 한번에 출력
//        System.out.println(Arrays.deepToString(arr2));
//        2차원 가변배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//
////        가변배열 리터럴 방식
//        int[][] arr2 = {{10,20}, {10,20,30}};

//        [3][4]사이즈 배열을 선언한뒤
//        1~12까지 숫자값 각 배열에 할당 후 출력
//        int[][] test = new int[3][4];
//        for(int i = 0 ; i < test.length; i++){
//            for(int j = 0 ; j < test[0].length;j++){
//                test[i][j] = (i*4)+j+1;
//            }
//        }
//
//        System.out.println(Arrays.deepToString(test));
//x        가변배열실습 : 행의길이(전체배열의길이)5 => {{10}, {20,20}, {30,30,30},{40,40,40,40},{x,x,x,x,x}}
        int[][] arr = new int[5][];

        for(int i = 1 ; i < arr.length+1; i++){
            arr[i-1] = new int[i];
            Arrays.fill(arr[i - 1], i * 10);
//          .   for(int j = 0 ; j < arr[i-1].length; j++){
//                arr[i-1][j] = i*10;
//            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
