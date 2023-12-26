package C16EtcClass;

public class C1605EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("shin1");
        s1.setClassGrade(ClassGrade.a1);

        EnumStudent s2 = new EnumStudent();
        s2.setName("shin2");
        s2.setClassGrade(ClassGrade.a2);

        EnumStudent s3 = new EnumStudent();
        s3.setName("shin3");
//        타입이 여전히 String 타입이므로, 클래스 변수를 사용하지 않을수도 있다.
//        -> 타입 강제가 되지 않기 때문에 통일성이 깨질 수 있음
        s3.setClassGrade("third");

        EnumStudent s4 = new EnumStudent();
        s4.setName("shin4");
//        String으로 세팅 불가 -> 타입을 강제하므로
//        Enum타입 사용 시에는 static final 변수와 동일한 방법으로 사용
        s4.setRole(Role.GENERAL_USER);
        System.out.println(s4.getRole());
        System.out.println(s4.getRole().getClass());
//        ⭐ enum값 내부에는 저장된 순서대로 0부터 index 값이 내부적으로 할당
        System.out.println(s4.getRole().ordinal());
    }
}

class ClassGrade{
    static final String a1 = "first_grade";
    static final String a2 = "second_grade";
    static final String a3 = "third_grade";
}
enum Role{
//    각 열거형 상수는 콤마(,)로 구분하고, 상수 목록 끝에는 세미콜론(;)으로 마무리.
    GENERAL_USER, ADMIN_USER, SUPER_USER;
}

class EnumStudent{
    private String name;
//    소속반
    private String classGrade;
//    String 타입이 아닌 Role 타입을 신규로 지정. -> 타입 강제
//    DB의 ENUM 타입과 싱크
    private Role role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
