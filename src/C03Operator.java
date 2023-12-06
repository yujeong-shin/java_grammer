public class C03Operator {
    public static void main(String[] args) {
////        산술연산자
//        int num1=8, num2=3;
////        *곱셈, /니눗셈, %나머지
//        System.out.println("num1 + num2 = " + (num1+num2));
//        System.out.println("num1 - num2 = " + (num1-num2));
//        System.out.println("num1 * num2 = " + (num1*num2));
//        System.out.println("num1 / num2 = " + (num1/(double)num2));
//        System.out.println("num1 % num2 = " + (num1%num2));
//
////        대입연산자
//        int n1=7, n2=7, n3=7;
//        n1 = n1-3;
//        n2 -= 3;
//        n3 =- 3;

////        /=, %=
//        int n4 = 10, n5 = 10;
//        n4/=3;
//        n5%=3;
//        System.out.println("n4 = " + n4);
//        System.out.println("n5 = " + n5);

////        증감연산자
//        int a = 5;
//        int b = a++; //후위연산자 : 실행문이 끝나고 증감
//        System.out.println(a); //6
//        System.out.println(b); //5
//
//        a = 5;
//        b = ++a; //전위연산자 : 실행문이 끝나기 전에 증감
//        System.out.println(a); //6
//        System.out.println(b); //6

////        비교연산자
//        char char1 = 'a';
//        char char2 = 'A';
//        System.out.println(char1==char2);
//        System.out.println(char1!=char2);

////        논리연산자 : &&, ||, !
//        int num1 = 10, num2=20;
//        boolean result1, result2;
////        result1에 num1이 5보다 큰지, 20보다 작은지 조건을 and 조건을 통해 boolean 담기
//        result1 = (num1>5) && (num1<20);
////        result2에 num2가 10보다 작은 조건, 30보다 작은 조건을 or 조건을 통해 boolean 담기
//        result2 = (num2<10) || (num2<30);
//        System.out.println(result1);
//        System.out.println(!result2);

////           0000101        0000110
//        int n1 = 5; int n2 = 6;
////        비트연산자 : & : 각 자리 수가 모두 1일 경우만 1
//        System.out.println(n1 & n2); //4 ==> 0000100
////        비트연산자 : | : 각 자리 수가 하나라도 1이면 1
//        System.out.println(n1 | n2); //7 ==> 0000111
////        비트연산자 : ^ : 각 자리의 수가 일치하지 않은 경우 1
//        System.out.println(n1^n2); //3 ==> 0000011
////        비트연산자 : ~ : 각 자리마다 반대의 숫자 반환
//        System.out.println(~n1);

//        시프트연산자 : << 숫자, >> 숫자 : 숫자만큼 왼쪽,오른쪽 이동
//        << : 곱셈의 효과, >> 나눗셈의 효과
//        System.out.println(n1 << 1); // 5 X 2^1
//        System.out.println(n1 << 2); // 5 X 2^2
//
//        int a = 13; //00001101
//        int b = 9;  //00001001
//        while(b != 0){
//            int same_index = a & b; //and 연산으로 구한 carry 생성
//            a = a^b; //a = 00000100 // XOR 연산으로 구한 비트값 a에 할당
//            b = same_index << 1; //b = 00010010
//        }
//        System.out.println(a);
    }
}
