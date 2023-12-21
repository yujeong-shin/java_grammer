package C15AnonymousLambda;
public class C1502AnnonymousClass {
    public static void main(String[] args) {
//        클래스명이 Animal이 아닌 이름없는 익명 클래스와 객체를 동시에 생성
        Animal dog = new Animal() {
            @Override
            public void makesound(int n) {
                System.out.println("멍멍" + n);
            }
        };
        dog.makesound(10);

//        익명객체에 구현메서드가 1개밖에 없을 경우에 람다표현식(화살표함수)로 표현가능 () ->
//        ()부분에 매개변수 지정하여 구현체에서 활용, 변수의 개수가 많을때는 개수에 맞춰 지정
        Animal cat = (n) -> System.out.println("야옹" + n);
    }
}

interface Animal{
    void makesound(int n);
}