import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
////        출력
//        int a = 20;
////        print는 출력후 출바꿈 없음, println은 출력후 줄바꿈
//        System.out.print(a);
//        String myStirng = "hello world";
////        문자열과 숫자를 합하면 문자가 된다.
//        System.out.println(myStirng + a);
////        숫자와 숫자를 더하면 더하기 연산된다.
//        System.out.println(10+20);

//        입력 : System.in(키보드입력) + scanner(입력을 위한 클래스)
        Scanner myScan = new Scanner(System.in);
//        System.out.println("아무 문자열을 입력해주세요");
////        nextLine은 입력 받은 데이터를 한 줄 읽어서 String으로 리턴
//        String inputs = myScan.nextLine();
//        System.out.println("사용자가 입력한 문자열 : " + inputs);
//
////        nextint는 입력 받은 데이터를 한 줄 읽어서 int로 리턴
//        int inputs_int = myScan.nextInt();
//        System.out.println("사용자가 입력한 숫자는 : " + inputs_int);


//        System.out.println("더하기할 숫자 2개를 입력해주세요.");
//        int a = myScan.nextInt();
//        int b = myScan.nextInt();
//        int sum = a + b;
//        System.out.println("입력하신 두 수를 더한 값은" + sum + "입니다"  );
//        System.out.println("입력하신 두 수를 더한 값은" + a+b + "입니다"  );
//        System.out.println("입력하신 두 수를 더한 값은" + (a+b) + "입니다"  );

        System.out.println("nextDouble을 통해서 소수점 입력 후 출력해주세요.");
        double a = myScan.nextDouble();
        System.out.println("입력하신 실수는 : " + a);

        System.out.println("true 또는 false를 입력해주세요");
        boolean b = myScan.nextBoolean();
        System.out.println("입력하신 참/거짓은 : " + b);

//        입출력 시스템 메모리 해제
        myScan.close();



    }
}