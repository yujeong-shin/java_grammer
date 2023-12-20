package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements myImplements = new MyImplements();
        myImplements.methodA();
//        myImplements.my_constant; //접근 불가능
        System.out.println(MyInterface.my_constant);
    }
}

interface MyInterface{
//    아래 변수는 컴파일타임에 static final이 붙는다.
//    MyInterface.my_constant로 static하게 접근 가능하지만,
//    객체를 만들어서 객체명.my_constant로 접근은 불가능하다.
    int my_constant = 100;
    void methodA();
}

class MyImplements implements MyInterface{

    @Override
    public void methodA() {
        System.out.println("methodA가 호출되었습니다.");
    }
}
