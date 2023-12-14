package C12ClassLecture;

public class C1203Class2 {
    public static void main(String[] args) {
//        age 20 미만 세팅 안되도록 -> 나이가 너무 어립니다
//        email @가 없으면 세팅 안되도록 -> 잘못된 형식입니다
//        name 10글자 초과 안되도록 -> 글자 수 초과입니다
        Person person1 = new Person();
        person1.setAge(15);
        person1.setName("aaaaaaaaaaaaa");
        person1.setEmail("abcdefda.com");
        person1.whoIs();

        Person person2 = new Person();
        person2.setAge(30);
        person2.setName("bbb");
        person2.setEmail("bbb@naver.com");
        person2.whoIs();
    }
}
class Person{
    private String name, email;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>10) System.out.println("설정가능한 글자 수의 범위는 10글자입니다.");
        else this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")) System.out.println("잘못된 형식의 이메일입니다.");
        else this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<20) System.out.println("나이가 너무 어립니다.");
        else this.age = age;
    }

    public void whoIs(){
        System.out.println(name + " " + email + " " + age + "입니다.");
    }
}
