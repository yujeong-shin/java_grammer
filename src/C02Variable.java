import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//        byte num1 = 127;
//        num1 += 1;
//        byte num2 = -128;
//        num2 -= 1;
//        System.out.println(num1);
//        System.out.println(num2);
//
//        //부동 소수점 오차 테스트
//        double double_num = 0.1;
//        //미세오차는 조정되어 정상적으로 출력
//        System.out.println(double_num);
//        //반복적인 연산시 오차가 확대되어 오차확인가능
//        double double_num_result=0;
//        for(int i=0; i<1000; i++){
//            double_num_result += double_num;
//        }
//        System.out.println("double_num_result = " + double_num_result);

//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
//
//        BigDecimal myBig1 = new BigDecimal("1.03");
//        BigDecimal myBig2 = new BigDecimal("0.42");
//        System.out.println(myBig1.subtract(myBig2));
//        // double result = myBig1.subtract(myBig2);는 에러
//        double result = myBig1.subtract(myBig2).doubleValue();
//        System.out.println("result = " + result);
//
//        char my_char = '가';
//        System.out.println(my_char);

//        boolean : true(1) or false(0)
//        boolean my_bool = true;
//        System.out.println("my_bool = " + my_bool);
//        if(my_bool) System.out.println("조건식이 참입니다.");
//
//        int bool_num1 = 20;
//        int bool_num2 = 10;
//        if(bool_num1> bool_num2) {
//            System.out.println("조건식이 참입니다.");
//        }

// //         묵시적 타입변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println("ch1_num = " + ch1_num);
// //         char형 알파벳 비교를 위한 묵시적 타입변환이 일어난다.
//         System.out.println('A' > 'a');

//        int my_int1 = 10;
////         int -> double
//        double my_double1 = my_int1;
//        System.out.println("my_double1 = " + my_double1);
////        에러 발생 : my_int1 = my_double1;
////        double -> int 명시적 타입은 가능 : 소수점 값 손실 발생 가능성이 있다.
//        my_int1 = (int)my_double1;
//        double my_double2 = 7.2f;
//        System.out.println("my_double2 = " + my_double2);
//
////        명시적 타입변환
//        char my_char2 = 'b';
//        int char_num = (int)my_char2;
//        System.out.println("char_num = " + char_num);
//        int a가 1 int b가 4일 때, 둘을 나눈 값을 int에 담아 출력, double에 담아 출력
//        int a = 1;
//        int b = 4;
//        int c = a/b;
//        double d = a/b;
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//        double d2 = (double)a/b;
//        double d3 = a/(double)b;
//        System.out.println("d2 = " + d2);
//        System.out.println("d3 = " + d3);

//        변수와 상수
//        선언과 동시에 초기화
        int a1 = 10;
//        변수값 변경
        a1 = 20;
//        선언만 한 뒤에 나중에 초기화
        int a2; //선언만 됐을 때는 값이 0으로 초기화
        a2 = 20;
//        상수는 값의 재할당이 불가능
        final int AGES = 20;
//        상수는 값의 변경이 불가능 -> AGES = 20; 에러 발생
//        상수는 선언만 한 뒤에 나중에 초기화하는 방식이 java8 이전에는 안됐었지만, 이후 가능해짐.

    }
}
