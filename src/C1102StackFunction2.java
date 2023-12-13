public class C1102StackFunction2 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        System.out.println(function1(1));
        System.out.println("main함수 종료");
    }
    static int function1(int a){
        System.out.println("function1 시작");
        System.out.println("function1 끝");
        return function1(a*2);
    }
}
