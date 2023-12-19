package C13Inheritance;

import java.util.ArrayList;

public class C1303MethodOverriding {
    public static void main(String[] args) {
//        상속 관계일 때 부모클래스 타입을 자식클래스 객체의 타입으로 지정가능
//        Animal 클래스에 정의된 메서드만 사용가능하도록 제약이 발생
//        Animal dog = new Dog();
//        dog.sound2();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }


}
class Animal{
    void sound(){
        System.out.println("동물은 소리를 냅니다");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog은 멍멍 소리를 냅니다");
    }
//    void sound2(){
//        System.out.println("Dog은 멍멍 소리를 냅니다");
//    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat은 야옹 소리를 냅니다");
    }
}