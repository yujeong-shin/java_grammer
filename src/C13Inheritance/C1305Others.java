package C13Inheritance;
//import java.util.* : util 하위의 모든 클래스/인터페이스 파일 import 가능
//External Libraries > java.base > java > util
//import java.* : 불가능. 특정 패키지의 하위패키지의 모든 파일까지 import하는 것은 불가능.

//final 클래스는 상속불가
//public class C1305Others extends FinalClass{
public class C1305Others{
    public static void main(String[] args) {
        C1305Dog myDog = new C1305Dog();
        myDog.makeSound1(); //Dog객체의 메서드
        myDog.makeSound2(); //상속받은 메서드

//        추상 클래스의 추상 메서드를 오버라이딩을 강제하고 있다.
//        상속을 받으면 반드시 오버라이딩(구현)해야만 사용할 수 있다.
//        그렇지만 이 상황은 자식 클래스 없이(상속없이) 즉시 구현으로 객체를 만들어버림
//        자기 자신의 클래스 이름을 잃어버림 ==> 익명 객체
//        myAnimal.getClass() --> class C13Inheritance.C1305Others$1 출력
        C1305Animal myAnimal = new C1305Animal() {
            @Override
            void makeSound1() {
            }
        };
        System.out.println(myDog.getClass());
        System.out.println(myAnimal.getClass());
    }
}

final class FinalClass{

}
abstract class C1305Animal{
//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }
    abstract void makeSound1();

//    ⭐⭐⭐abstract 클래스는 일반메서드를 가질 수 있다.
    void makeSound2(){
        System.out.println("makesound2");
    }
}
class C1305Dog extends C1305Animal{
    @Override
    void makeSound1() {
        System.out.println("makesound1");
    }


////    final 메서드는 오버라이딩 불가
//    @Override
//    void makeSound(){
//        System.out.println("멍멍");
//    }
}