package C13Inheritance_Test;

import C13Inheritance.C1304ProtectedClass;

public class ProtectedMain extends C1304ProtectedClass{
    public static void main(String[] args) {
////        접근 범위에 상속 관계가 영향을 못 끼침
//        C1304ProtectedClass protectedClass = new C1304ProtectedClass();
//
////        다른 패키지이기 때문에 protected, default 접근 불가능
//        //        public 접근가능
//        System.out.println(protectedClass.str4);

//        상속받은 객체로 생성하면 protected 변수 접근 가능
        ProtectedMain pm = new ProtectedMain();
        System.out.println(pm.str3);
        System.out.println(pm.str4);
    }
}
