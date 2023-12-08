import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
////        표현식1
//        int[] int_arr1 = {1,2,3,4};
////        표현식2
//        int[] int_arr2 = new int[4];
//        int_arr2[0] = 1;
//        int_arr2[1] = 2;
//        int_arr2[2] = 3;
//        int_arr2[3] = 4;
////        표현식3
//        int[] int_arr3 = new int[]{1,2,3,4};
////        표현식4는 불가 : 자바의 배열을 반드시 길이가 지정되어야 함.
////        int[] int_arr4 = new int[];
////        표현식5
////        String 배열은 초기값이 null이기 때문에 값을 채우기 전에 접근하면 NullPointerException 발생
//        String[] arr_st = new String[5];
//        for (int i = 0; i < arr_st.length; i++) {
//            if(arr_st[i].isEmpty()){
//                System.out.println("비어있습니다");
//            }
//        }
////        int 배열은 초기값이 0이기 때문에 연산을 해줘도 상관없음
//        int[] arr_int = new int[5];
//        for (int i = 0; i < arr_st.length; i++) {
//            arr_int[i] += 10;
//        }

////        85, 65, 90인 int 배열을 선언한 뒤, 종합, 평균값
//        int[] arr = {85, 65, 90};
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("종합 : " + sum);
//        System.out.println("평균값 : " + (double)sum/arr.length);

////        배열의 순서바꾸기
//        int[] arr = {10, 20};
//        int tmp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = tmp;
//        System.out.println(Arrays.toString(arr));

////        0번째 index부터 마지막까지 자리 change
//        int[] arr2 = {10,20,30,40,50,60,70};
//        for (int i = 0; i < arr2.length-1; i++) {
//            int tmp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = tmp;
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        int[] revArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            revArr[arr.length-(i+1)] = arr[i];
//        }
//        System.out.println(Arrays.toString(revArr));

////        배열 뒤집기2
//        int[] arr = {1,2,3,4,5};
//        for (int i = 0; i < arr.length/2; i++) {
//            int tmp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = tmp;
//        }
//        System.out.println(Arrays.toString(arr));

////        정렬 : sort() 함수 사용
//        int[] arr = {2, 6, 4, 5, 9, 6, 1, 4};
////        오름차순 정렬이 기본
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
////        내림차순 정렬
////        방법1. Comparator 클래스 사용
////        객체타입인 경우에만 Comparator 클래스 사용 가능
////        기본타입(int, ... )은 사용 불가
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr);
//        System.out.println(Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//        Integer[] arr_integer = {2, 6, 4, 5, 9, 6, 1, 4};
//
//        Arrays.sort(arr_integer, Comparator.reverseOrder()); //기본형타입은 처리 불가

////        방법2. 배열뒤집기
////       sort후 배열 뒤집기
//        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length/2; i++) {
//            int tmp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = tmp;
//        }
//        System.out.println(Arrays.toString(arr));

//        streamAPI, lambda를 활용한 내림차순 정렬
//        stream : 데이터의 복제본
        int[] arr2 = {2, 6, 3, 5, 9, 8, 1, 4};
        int[] new_arr2 = Arrays.stream(arr2)  //arr2를 대상으로 stream 객체 생성
                         .boxed() //Integer로 형변환한 stream 객체 생성 (int를 Integer로 변환)
                         .sorted(Comparator.reverseOrder()) //내림차순 정렬
                         .mapToInt(a->a) //Integer를 int로 변환
                         .toArray(); //배열로 변환
        
    }
}
