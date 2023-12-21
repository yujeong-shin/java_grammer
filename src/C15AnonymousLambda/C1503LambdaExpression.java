package C15AnonymousLambda;
public class C1503LambdaExpression {
    public static void main(String[] args) {

//        실행문 1개일때에는 return 생략
//        실행문 2개 이상일때에는 return 필요 {}포함하여 return 필요
//        매게변수를 순서로 인지하므로, 타입을 지정해줄필요는 없다.
        LambdaInterface li = (a, b, c) -> {
            String answer = a + b + c;
            return answer;
        };
        System.out.println(li.makeString("hello","bye",30));
    }
}

interface LambdaInterface {
    String makeString(String a, String b, int c);
}