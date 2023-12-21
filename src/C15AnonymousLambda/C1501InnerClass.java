package C15AnonymousLambda;
public class C1501InnerClass {
    public static void main(String[] args) {
        MemberInnerClass.staticInnerClass si = new MemberInnerClass.staticInnerClass();
        si.display();

    }
}
//일반 내부클래스
class MemberInnerClass{
    //    static 내부클래스
//    이클래스는 C1501InnerClss의 정적 멤버처럼 활용
    static class staticInnerClass{
        private int data;
        void display(){
            System.out.println("data값은" + data + "입니다.");
        }

    }
}