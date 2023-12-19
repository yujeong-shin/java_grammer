package C13Inheritance;

//super() : 부모클래스의 생성자를 의미, super 키워드 : 부모클래스 의미
public class C1302SuperChildClass extends SuperParents{
    int b;
    int a;
    C1302SuperChildClass(){
        super(100); //부모 클래스의 생성자 호출
        a = 30;
        b = 20;
    }

    void disPlay(){
        System.out.println(a);
        System.out.println(super.a); //부모 클래스의 인스턴스 변수
        System.out.println(b);
    }

    public static void main(String[] args) {
        C1302SuperChildClass sc = new C1302SuperChildClass();
        sc.disPlay();
    }
}

class SuperParents{
    int a;
    SuperParents(int a){
        this.a = a;
    }
}