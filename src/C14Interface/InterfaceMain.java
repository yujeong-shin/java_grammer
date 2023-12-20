package C14Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements myCat = new CatImplements();
        myCat.makeSound();
        DogImplements myDog = new DogImplements();
        myDog.makeSound();

//        타입 부분에 인터페이스로 대체할 수 있나? ㅇㅇ
//        인터페이스 객체명 = new 구현체(); 형식이고
//        인터페이스에 정의되어 있는 기능이 구현체에서 무조건 오버라이딩(구현)해야 하기 떄문에 가능
//        AnimalInterface1에 있는 메소드들만 사용할 수 있도록 제한됨

////        타입을 interface1로 선언하면 interface2에 정의된 메서드는 사용불가
//        AnimalInterface1 myCatInterface = new CatMultiImplements();
//        System.out.println(myCatInterface.play("호두", "자원"));
////        타입을 interface2로 선언하면 interface1에 정의된 메서드는 사용불가
//        AnimalInterface2 myDogInterface = new DogMultiImplements();
//        myDogInterface.makeSound();

//        다형성이란 하나의 객체가 여러 개의 참조 변수를 가질 수 있음을 의미
        CatMultiImplements myMultiCat = new CatMultiImplements();
        myMultiCat.makeSound();
        System.out.println(myMultiCat.play("호두", "자원"));

        DogMultiImplements myMultiDog = new DogMultiImplements();
        myMultiDog.makeSound();
        System.out.println(myMultiDog.play("자원", "호두"));


//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명 내부 클래스 방식으로 사용 가능
        AnimalInterface1 ai = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };
    }
}
