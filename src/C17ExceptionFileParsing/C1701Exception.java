package C17ExceptionFileParsing;

import java.util.Scanner;

public class C1701Exception {
    public static void main(String[] args) {
////        ArithmeticException : 0으로 나눌 때
//        System.out.println("나눗셈 프로그램입니다. 숫자 10에 나눌 분모 값을 입력해주세요.");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
////        예외가 발생할 것으로 예상되는 코드에 try catch로 감싸준다.
//        try{
//            System.out.println("10에 " + input + "을 나누면 ");
//            System.out.println(num/input + "입니다.");
////            catch에는 try 구문 안에서 발생 가능한 예외 상황을 적어야 정상적으로 catch가 된다.
////            사용자에게 적절한 문구를 전달하기 위해 에러를 세분화해서 처리함
//        }catch (IllegalArgumentException e){
//            System.out.println("정상적이지 않은 입력을 넣었습니다.");
//            e.printStackTrace();
//        }
//        catch(ArithmeticException e){
//            System.out.println("0으로 나누시면 안됩니다.");
////            e안에 예외 관련된 정보들이 들어있음.
//            System.out.println(e.getMessage());
//            e.printStackTrace(); //어디서 에러가 발생했는지 상세하게 알려줌
//        }catch (Exception e){
//            System.out.println("알 수 없는 예외가 발생했습니다.");
//            e.printStackTrace();
//        }
//        finally {
////            반드시 실행되어야 하는 구문 삽입
//        }
//        System.out.println("감사합니다.");


//        throw와 throws 예제
//        throw new : 강제로 예외를 발생시킴
//        throws : 호출하는 측에 예외 처리를 위임
        String password = "1234";
//        if (password.length() < 10) {
//            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
//        }

        try{
            login(password);
        }catch(IllegalArgumentException e){
//            e.getMessage()는 login메서드에서 throw new한 곳에서 넘어온 메시지.
            System.out.println(e.getMessage());
        }
    }
//    unchecked exception에서 throws를 하지 않더라도 예외는 호출한 곳으로 전파
//    이때, throws를 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것일 뿐.
//    checked exception은 예외 처리가 강제되고, 해당 메서드에서 예외 처리를 하든지 throws를 통해 호출한 곳에 위임
//    이때, 호출한 쪽에서는 예외 처리가 강제된다.
//    (1) throws로 main에게 예외 처리 위임
//    throws가 있든 없든 main에는 예외 처리 정보가 넘어감
    static void login(String password) throws IllegalArgumentException{
        if (password.length() < 10) {
//            ⭐⭐
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
    }

//바로 호출하는 곳에서 예외 처리


////     main함수 - login1(password);
//    static void login1(){
//        try{}
////        throws로 던질게 아니며 여기에서 try-catch로 예외 처리해 주어야 함
//        }
    }