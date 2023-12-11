import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class C07SortPractice {
    public static void main(String[] args) {
//        int[] arr = {30, 22, 20, 25, 12};
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[j] < arr[i]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

////        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을 때 만들어질 수 있는 2개의 조합의 합을 출력하라.
//        int[] int_arr = {10, 20, 30, 40, 50, 60};
//        for (int i = 0; i < int_arr.length-1; i++) {
//            for (int j = i+1; j < int_arr.length; j++) {
//                System.out.println(int_arr[i] + " + " + int_arr[j] + " = " + (int_arr[i]+int_arr[j]));
//            }
//        }

////       중복 제거하기
//        int[] temp = {10, 10, 40, 5, 7};
//        Arrays.sort(temp);
//////        배열복사
////        int[] new_temp = Arrays.copyOfRange(temp,0, 3);
////        System.out.println(Arrays.toString(new_temp));
//        int[] new_temp = new int[temp.length];
//        int index=0;
//        for (int i = 0; i < temp.length; i++) {
//            if(i==temp.length-1) {
//                new_temp[index] = temp[i];
//                index++;
//                break;
//            }
//            if(temp[i] != temp[i+1]) {
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
//        //36-40줄 대체
//        //new_temp[index++] = temp[temp.length-1];
//        int[] answer = Arrays.copyOfRange(new_temp, 0, index);
//
//        System.out.println(Arrays.toString(answer));


//        int[] bubble_sort = {5, 1, 2, 3, 4};
//        for (int i = 0; i < bubble_sort.length-1; i++) {
//            boolean ch=true;
//            for (int j = 0; j < bubble_sort.length-1-i; j++) {
//                if(bubble_sort[j] > bubble_sort[j+1]) {
//                    ch=false;
//                    int tmp = bubble_sort[j];
//                    bubble_sort[j] = bubble_sort[j+1];
//                    bubble_sort[j+1] = tmp;
//                }
//            }
//            System.out.println(Arrays.toString(bubble_sort));
//            if(ch) break;
//        }

////         배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int answer = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]==0) {
//                answer=i;
//                break;
//            }
//        }
//        System.out.println(answer);

////        이진검색(Binary Search)
////        사전에 오름차순 정렬이 되어 있어야 이진검색 가능.
//        int[] arr = {1, 3, 6, 8, 9, 11};
////        Arrays.sort(arr); //정렬 안되어 있다면 정렬해야 함
//        int answer = Arrays.binarySearch(arr, 8);
//        System.out.println(answer);

////        배열간 비교 : equals, 순서까지 동일해야 true
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 30, 10};
//        int[] arr3 = {10, 20, 30};
//        System.out.println(Arrays.equals(arr1, arr2));
//        System.out.println(Arrays.equals(arr1, arr3));
//
////        배열복사 : copyOf(배열, end), copyOfRange(배열, start, end)
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] new_arr1 = Arrays.copyOf(arr, 10);
//        int[] new_arr2 = Arrays.copyOfRange(arr, 1, 4);
//        System.out.println(Arrays.toString(new_arr1));
//        System.out.println(Arrays.toString(new_arr2));

////        2차원 배열 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        System.out.println(Arrays.deepToString(arr));
//
////        2차원 가변배열 선언 및 할당
//        int[][] arr2 = new int[3][];
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
//        System.out.println(Arrays.deepToString(arr2));
//
////        가별배열 리터럴 방식
//        int[][] arr3 = {{10}, {10, 20}, {10, 20, 30}};
//        System.out.println(Arrays.deepToString(arr3));

////        [3][4] 사이즈의 배열을 선언한 뒤
////        1,2,3 ~ 12까지의 숫자 각 배열에 할당
//        int[][] arr = new int[3][4];
//        int num=1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

////        가변배열만들기 : 전체사이즈5
////        각 배열마다 사이즈 1, 2, 3, 4, 5로 커지도록 : for문
////        각 사이즈별로 1은 10이 모두 들어가고, 2는 20가 모두 들어가고, 3은 30이 모두 들어가도록
//        int[][] arr = new int[5][];
////        아래를 반복문으로 처리
////        arr[0] = new int[1];
////        arr[1] = new int[2];
////        arr[2] = new int[3];
////        arr[3] = new int[4];
////        arr[4] = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i+1];
//        }
//        int num=1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = num*10;
//            }
//            num++;
//        }
//        System.out.println(Arrays.deepToString(arr));


    }
}
