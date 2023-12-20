package C13Inheritance;

public class C1304ProtectedTest {
    public static void main(String[] args) {
        C1304ProtectedClass protectedClass = new C1304ProtectedClass();
//        default 접근가능
        System.out.println(protectedClass.str2);
//        protected 접근가능
        System.out.println(protectedClass.str3);
//        public 접근가능
        System.out.println(protectedClass.str4);
    }
}
