import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        // 2~10까지 출력하는 while문 예제
//        int a = 2;
//        while(a<=10) {
//            System.out.println(a);
//            a++;
//        }

//        //구구단
//        Scanner sc = new Scanner(System.in);
//        System.out.println("구구단 단수를 입력해주세요");
//        int input = sc.nextInt();
//        int a = 1;
//        while(a<10){
//            System.out.println(input + " X " + a + " = " + input*a);
//            a++;
//        }

////        도어락키 if문 예제 : 비밀번호를 맞추면 반복이 종료되고, 그렇지 않으면 계속적으로 다시 질문
////        최대 5번까지만 비밀번호 입력 가능하도록 제한 => 입력 횟수 초과했습니다 문구 출력
//        int a=0;
//        while(true){
//            String answer="1234";
//            System.out.println("비밀번호를 입력해주세요");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(answer.equals(input)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            }
//            else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if(a==5) {
//              System.out.println("입력 횟수를 초과했습니다.");
//                break;
//                }
//        }

////        do-while문 작성
//        int a = 1;
//        do{
//            a++;
//            System.out.println(a);
//        }while(a<10);

////        for문을 통해 2~10까지 출력
//        for (int i = 2; i <= 10; i++) {
//            System.out.println(i);
//        }

////        1~20까지 짝수의 합 출력
//        int sum=0;
//        for (int i = 2; i <= 20; i+=2) {
//            sum+=i;
//        }
//        System.out.println("1~20까지 짝수의 합 = " + sum);
//

////        숫자 뒤집기
//        int num = 1234;
//        int result=0;
//        while(num>0) {
//            int res = num % 10;
//            result = (result * 10) + res;
//            num = num / 10;
//        }
//        System.out.println(result);

//        최대공약수 찾기
//        int a=24, b=36;
//        int minNum = Math.min(a, b);
//        int answer=0;
//        for (int i = 1; i < minNum; i++) {
//            if(a%i==0 && b%i==0) {
//                answer = i;
//            }
//        }
//        System.out.println("answer = " + answer);

////        일반 for문을 통해 myArr의 값에 10씩 더한 뒤에 출력.
//        int[] myArr = {1, 5, 7, 9, 10};
//        for (int i = 0; i < 5; i++) {
//            myArr[i] += 10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
////        향상된 for문
//        for(int e : myArr) {
//            e += 10;
//        }
//        System.out.println(Arrays.toString(myArr));

////        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); //if문 밖에서 선언된 변수값을 if문 안에서 접근하여 변경하는 것은 가능.
////        System.out.println(abc); //if문 안에서 정의된 변수는 인지 불가

////        다중반복문
////        2~9단 전부 출력. 단 바뀔 때마다 "X단 입니다" 출력
//        for (int i = 2; i <= 9; i++) {
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " X " + j + " = " + i*j);
//            }
//            System.out.println();

////        2중 for문을 통해 배열 접근
//        int[][] arr = {{1, 2, 3, 4},{5, 6, 7, 8}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


////        라벨문
//        loop1:
//        for(int i=0; i<5; i++){
//            loop2:
//            for(int j=0; j<5; j++){
//                System.out.println("hello world");
//                if(j==2)
//                    //break;
//                    break loop1;
//            }
//        }

////        라벨문 활용1
//        int[][] matrix = {{1,2,3,4},{5,6,7,8,9},{9,10,11},{12,13,14,15,16}};
//        int target = 11;
//        loop1:
//        for (int i = 0; i < matrix.length; i++) {
//            loop2:
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(matrix[i][j]==target){
//                    System.out.println("matrix[" + i + "][" + j + "]에 있는 값입니다");
//                    break loop1;
//                }
//            }
//        }

//        라벨문 활용2
//        1~20 숫자 중, 약수가 5개 이상인 숫자 중에 가장 작은 값을 구하시오.

//        loop1:
//        for (int i = 1; i <= 20; i++) {
//            int count=0;
//            for (int j = 1; j <= i; j++) {
//                if(i%j==0) count++;
//                if(count==5) {
//                    System.out.println(i);
//                    break loop1;
//                }
//            }
//        }

    }
}
