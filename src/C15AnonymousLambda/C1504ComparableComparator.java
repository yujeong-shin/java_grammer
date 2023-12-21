package C15AnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
////        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공: comparable, Comparator
////        Comparable 인터페이스에는 compareTo메소드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음
////        => 일반적으로 클래스내에서 직접 구현해서 사용하는 방식 => 쉽게 sort하기 위해서
////        Compartor인터페이스에는 compare메소드가 선언
//
////        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
////        문자열의 자릿수의 차이가 발생할때, 그 문자의 유니코드 값의 차이를 반환,
//        String a = "hello";
//        String b = "horld";
//        System.out.println(a.compareTo(b));
//
//        List<String> myList = new ArrayList<>();
//        myList.add(a);
//        myList.add(b);
//        Collections.sort(myList); //Comparable의 compareTo메소드를 통해 정렬
//        System.out.println(myList);
//
////        음수를 return하면 왼쪽이 더 작고, 0이면 같은거다
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
////        List 클래스 내부에 정의된 sort함수 사용
//        myList.sort(Comparator.naturalOrder()); //myList는 Comparator 정렬밖에 안됨
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
//        Integer intA = 1;
//        Integer intB = 1;
//        System.out.println(intA.compareTo(intB));
//
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("은지", 22));
//        studentList.add(new Student("어린 은지", 25));
//        studentList.add(new Student("귀여운 은지", 20));
//        studentList.add(new Student("예쁜 은지", 24));
//        for(int i = 0; i < studentList.size(); i++){
//            System.out.println(studentList.get(i).getName() + studentList.get(i).getAge());
//        }
////        toString을 따로 호출하지 않아도 자동으로 호출됨.
////        toString을 오버라이딩 하지 않았다면 주소값이 출력됨.
//        System.out.println(studentList);
//
////        toString은 객체 자체를 가져오기 때문에
////        toString을 오버라이딩 하지 않은 채로 출력하면 주소값 출력됨.
////        for(Student s : studentList){
////            System.out.println(s.toString());
////        }
//
////        방법1 : Comparator를 익명 객체 방식으로 활용하여 정렬, 매개변수 2개
//        //나이로 정렬
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                기본은 오름차순 정렬하려고 시도
////                o1.getAge()가 더 작은 숫자라고 가정
//                return o1.getAge() - o2.getAge();
//            }
//        });
//        System.out.println(studentList);
////        ⭐⭐⭐
//        studentList.sort((o1, o2) -> o1.getAge()-o2.getAge());
//        System.out.println(studentList);
//
////        이름으로 정렬
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                기본은 오름차순 정렬하려고 시도
////                o1.getName()가 더 작은 숫자라고 가정
////                결과값이 음수면 오름차순, 양수면 내림차순
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        System.out.println(studentList);
//
//        studentList.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
//        System.out.println(studentList);
//
//        //        글자 길이수로 정렬
//        String[] strArr = {"hello", "java", "C++", "world2"};
////        Arrays.sort(strArr, Comparator.reverseOrder());
//        Arrays.sort(strArr, (o1, o2) -> o1.length() - o2.length());
//        //        Priority Queue 내림차순
//        Queue<String> myQue = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length());
//        Queue<String> myQu2e = new PriorityQueue<>(Comparator.reverseOrder());
//
////        방법2 : Comparable 인터페이스 implements 후 compareTo메서드 구현, 매개변수 1개
////        Comparator 안넣으면 객체 안에 구현하고 있는 Compareble의 compareTo사용
//        Collections.sort(studentList);
//
////        아래 방식도 가능함
////        Collections.sort(studentList, new Comparator<Student>() {
////            @Override
////            public int compare(Student o1, Student o2) {
////                return 0;
////            }
////        });


//        Thread 구현방식 : 쓰레드 상속, Runnable 방식
//        Thread = 작업의 단위, 어떤 사람이 작업을 할 때 할당되는 처리기
//        System.out.println("main의 쓰레드 입니다.");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });
        t1.start();
        // 람다식으로 변경 -> new Runnable위에 마우스 올리고 Replace with lambda 누르기
        new Thread(() -> System.out.println("새로 만든 쓰레드 입니다.")).start();
        System.out.println("main의 쓰레드 입니다.");
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //기본적으로 extends Object를 하고 있기 때문에 따로 상속관계를 적어주지 않아도
//    toString이 구현되어 있으면 자동으로 객체의 값을 출력해 줌
    //조상 클래스인 Object클래스의 toString을 overriding하여 객체 호출시 자동으로 toString메서드 호출
    @Override
    public String toString(){
        return "이름은 : " + this.name + " 나이는 : " + this.age;
    }

    @Override
    public int compareTo(Student o) {
//        정수형 비교
//        return this.age - o.age;
//        문자열 비교
        return this.name.compareTo(o.name);
    }
}