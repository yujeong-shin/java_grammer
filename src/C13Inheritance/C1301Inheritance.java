package C13Inheritance;

//extends 키워드를 통해 상속 관계를 표현
public class C1301Inheritance extends Parents{
    int c = 30;
    public static void main(String[] args) {
        C1301Inheritance ih = new C1301Inheritance();
        System.out.println(ih.c);
        System.out.println(ih.a);
//        자식클래스라 하더라도 private 변수는 상속 및 접근이 불가
//        System.out.println(ih.b);
        ih.parentMethod();
        ih.chileMethod();
    }

    void chileMethod(){
        System.out.println("자식 클래스입니다.");
    }
    @Override
    void parentMethod(){
        System.out.println("부모클래스가 아니라 자식클래스입니다.");
        //super.parentMethod();
    }
}
class Parents{
    int a = 10;
    private int b = 20;
    void parentMethod(){
        System.out.println("부모 클래스입니다.");
    }
}