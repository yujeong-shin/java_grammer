package C15AnonymousLambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI1 {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
//////        전통적인 방식의 데이터 접근방식
//////        원본 데이터에 접근해 원본 데이터를 바꿈
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////        }

//        ⭐복사본을 이용해 원본 데이터에 직접 접근하지 않아, 원본 데이터를 변경하지 않음.
//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        java에서 함수형 프로그래밍을 지원하기 위한 라이브러리 -> StreamApi
//        foreach : 스트림의 각 요소를 소모하면서 동작을 수행 <-> Map : 생성 메서드
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
//        int answer = Arrays.stream(arr).sum();
//
//        String[] myArr = {"world", "hello", "java"};
//        String[] newMyArr = Arrays.stream(myArr).sorted().toArray(String[]::new);

////        스트림의 생성
//        String[] strArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////        Stream<객체> : 제네릭 타입으로 stream 객체가 생성
//        Stream<String> stStream = Arrays.stream(strArr);
//
////        IntStream, DoubleStream 등 기본형에 대해서는 Stream객체가 정의되어 있음
////        연산 방식에 차이가 있음
//        int[] intArr = {10, 20, 30, 40, 50};
//        IntStream intStream = Arrays.stream(intArr);
////        System.out.println(intStream.sum());
//
//        int[] intArr2 = intStream.filter(a -> a>20).toArray();
//        System.out.println(Arrays.toString(intArr2));

////        참조 변수의 스트림 변환의 경우 제네릭의 타입소거 문제 발생
////        제네릭의 타입소거란 java 버전의 호환성을 위해 제네릭 타입을 런타임 시점에 제거하는 것을 의미
////        String[] strArr2 = stStream.filter(a-> a.length()<=4).toArray(a->new String[a]);
//        System.out.println(Arrays.toString(strArr2));

////        메소드 참조 방식으로 표현하는 것이 더 일반적
////        메소드 참조 방식 : 클래스::메서드
////        new 키워드는 클래스의 생성자를 호출하는 키워드 -> "메서드"
//        String[] strArr2 = stStream.filter(a-> a.length()<=4).toArray(String[]::new);

////        Stream 중개연산 : filter, map, sorted, distinct
////        distinct : 중복제거 후 스트림 반환
//        int[] intArr = {10, 10, 20, 30, 30, 40, 50, 50};
////        중복 제거 후 총 합 반환
//        int answer = Arrays.stream(intArr).distinct().sum();
//        System.out.println(answer);
//
//        String[] stArr = {"JAVA", "JAVA", "PYTHON", "C++"};
//        String[] stArr2 = Arrays.stream(stArr).distinct().toArray(String[]::new);
//        System.out.println(Arrays.toString(stArr2));
////        중복 제거하고 길이가 3개 이하인 것으로 제한하고, 남은 배열의 길이의 총합(sum)
////        mapToInt를 통해 IntStream으로 변환
////        map, mapToInt에 따라 반환되는 타입이 달라짐. Stream<Integer>는 .sum등 기능 지원X
//        IntStream myIntStream = Arrays.stream(stArr).distinct()
//                                .filter(a->a.length()<=3).mapToInt(a->a.length());
//
//        int sum = Arrays.stream(stArr).distinct().filter(a->a.length()<=3).mapToInt(a->a.length()).sum();
//
//        Stream<Integer> myStreamInteger= Arrays.stream(stArr).distinct().filter(a->a.length()<=3).map(a->a.length());

////        sorted : 정렬된 스트림변환
//        int[] arr = {4, 1, 2, 3, 6, 7};
////        내림차순 정렬된 숫자 신규 배열 반환
//        int[] new_arr = Arrays.stream(arr).sorted().toArray();
//
////        List<Integer> myList = new ArrayList<>(Arrays.asList(arr)); -> Integer 이슈 발생ㅋㅋ
//        List<Integer> myList = new ArrayList<>(Arrays.asList(6,1,2,3,1,6));
//        List<Integer> myList2 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        List<String> stList = new ArrayList<>(Arrays.asList("C", "JAVA", "PYTHON", "C++", "JAVASCRIPT"));
////        streamAPI를 사용해서 문자열의 길이 4개 이상인, 문자열의 길이를 기준으로 내림차순 정렬하여 신규 List 생성
//        List<String> mySortedList = stList.stream().filter(a->a.length()>=4).sorted((o1, o2) -> o2.length()-o1.length()).collect(Collectors.toList());
//        System.out.println(mySortedList);

////        배열 모든 원소에 10 더하기
//        int[] arr_plus10 = Arrays.stream(arr).map(a-> a+10).toArray();
//        System.out.println(Arrays.toString(arr_plus10));

////        짝수만 골라서 해당 수의 제곱의 총합을 구하라.
//        int answer = Arrays.stream(arr).filter(a->a%2==0).map(a->a*a).sum();
////        문자열 길이가 짝수인 문자열의 길이를 제곱한 것의 총합 -> mapToInt()
////        int answer = Arrays.stream(arr).filter(a->a.length%2==0).mapToInt(a->a.length*a.length).sum();
//        System.out.println(answer);

//        Stream소모 : forEach, reduce
        //        reduce : 누적연산
//        int[] arr = {10, 20, 30, 40};
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//        Arrays.stream(arr).forEach(System.out::println);


//        초기값을 지정하지 않으면 Optional 객체 return
//        Optional 객체 : 값이 있을수도 있고, 없을수도 있다는 것을 명시한 타입(java8이후 추가)
//        어떤 값이 시작 값이 될지 모르니까 에러 발생
//        초기 값이 없으면 Optional로 생성됨
//        객체가 아닌 기본형 타입은 OptionalInt, OptionalLong, OptionalDouble 자료형 존재
//        나머지는 Optional<String>처럼 사용
//        int result = Arrays.stream(arr).reduce((a,b)->a*b);

////        누적곱
//        int result = Arrays.stream(arr).reduce(1, (a,b)->a*b);
//        System.out.println(result);
////        누적합
//        int sum = Arrays.stream(arr).reduce(0, (a,b)->a+b);
//        System.out.println(sum);
////        초기값이 없어도 잘 하긴 함 ㅋㅋ. 기왕이면 Optional 상황 만들지 말자
//        int sum2 = Arrays.stream(arr).reduce((a,b)->a+b).getAsInt();
//        System.out.println(sum2);

//        String a = null;
//        System.out.println(a.length());
//        Optional<String> myOptional = Optional.ofNullable("hello");
////        Optional일 경우, 있는지 없는지 체크하는 로직을 짜는 것이 좋다.
//        if(myOptional.isPresent()){
//            System.out.println(myOptional.get().length());
//        }


//        String[] stArr = {"hello", "java", "world"};
////        String answer = Arrays.stream(stArr).reduce((a,b)->a+", "+b).get();
////        System.out.println(answer);
//        Optional<String> answer = Arrays.stream(stArr).reduce((a,b)->a+", "+b);
//        if(answer.isPresent()){
//            System.out.println(answer.get());
//        }

//        count() : IntStream과 stream<Integer>
//        IntStream : map(a->a.length).sum(), min(), max()가능
//        stream<Integer> : mapToInt(a->a).sum()처럼 mapToInt로 IntStream으로 바꿔줘야 .sum() 사용가능
//        반환타입 OptionalInt : min(), max(), average()
//        반환타입 int : sum() --> 없으면 0 리턴해주면 되니까 Optional이 아니어도 됨
//
////        최소/최대/평균/총합/개수
////        최소 -> int로 받기
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(myList.stream().mapToInt(a->a).min().getAsInt());
//        System.out.println(myList.stream().mapToInt(a->a).max().getAsInt());
//        System.out.println(myList.stream().mapToInt(a->a).average().getAsDouble());
//        System.out.println(myList.stream().mapToInt(a->a).sum());
//        System.out.println(myList.stream().count());


//        findFirst
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("kim", 25));
        myStudents.add(new Student("lee", 22));
        myStudents.add(new Student("park", 44));
        myStudents.add(new Student("shin", 37));
        myStudents.add(new Student("shin", 35));
//        Student s1 = myStudents.stream().filter(a->a.getAge()>=30).findFirst().get();
//        System.out.println(s1);

////        Student객체 실습
////        1)  가장 나이 어린 사람 찾기
//        Student youngMan = myStudents.stream()
//                .sorted((o1, o2) -> o1.getAge()-o2.getAge()).findFirst().get();
//        System.out.println("가장 나이가 어린 사람 : " + youngMan);
////        2) 30대가 몇 명인지 출력
//        System.out.println("30대는 총 " + myStudents.stream().filter(a->a.getAge()>=30 && a.getAge()<=39).count() + "명 입니다.");
////        3) 모든 객체의 평균 나이 출력
//        System.out.println("모든 객체의 평균 나이 : " + myStudents.stream().mapToInt(a->a.getAge()).average().getAsDouble());
////        4) 30세 이하 선착순 누구인지 출력
//        Student first30 = myStudents.stream().filter(a->a.getAge()<=30).findFirst().get();
//        System.out.println("30세 이하 선착순 : " + first30);

////        기존의 java의 null
//        String st = null;
//        System.out.println(st.compareTo("abc")); //NullPointerException


////        java8 이후에 나온 Optional 객체를 통해 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
////        Optional 객체에 빈값을 명시적으로 넣는 방법 : Optional.empty();
//        Optional<String> opt1 = Optional.empty();
////        빈값일수도 있기 때문에 부적절 : NoSuchElementException예외 발생
////        System.out.println(opt1.get().compareTo("abc"));
//
////        빈 값인지 아닌지 check하는 방법1
////        메서드 : isPresent()
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("abc"));
//        }else{
//            System.out.println("값이 없습니다.");
//        }
//
////        Optional 객체 생성
//        Optional<String> opt2 = Optional.ofNullable("hello"); //null 있을수도 있음을 의미
//
////        ⭐빈 값인지 아닌지 check하는 방법2
////        orElse관련 메서드 사용하여 null(빈값)처리
////        orElse(), orElseGet(), orElseThrow()
////        orElse() : 값이 있으면 해당 값 return, 없으면 default 지정값 return
//        System.out.println(opt1.orElse("").compareTo("abc")); //""과 "abc"비교 ⭐⭐
//        System.out.println(opt2.orElse("").compareTo("abc")); //"hello"와 "abc"비교
//
////        orElseGet() : 값이 있으면 해당 값 return, 없으면 람다함수 또는 메소드 참조 실행
//        System.out.println(opt1.orElseGet(String::new).compareTo("abc")); //""과 "abc"비교
//        System.out.println(opt1.orElseGet(()->new String()).compareTo("abc")); //""과 "abc"비교
//
////        ⭐⭐orElseThrow() : 값이 있으면 해당 값 return, 없으면 지정된 예외 강제 발생
//        int result = opt1.orElseThrow(()->new NoSuchElementException("객체에 값이 없습니다")).compareTo("abc");
////        int result2 = opt1.orElseThrow(NoSuchElementException::new).compareTo("abc"); //문구는 try~catch문으로 넣어야 함
//        System.out.println(result);

//        OptionalInt, OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a->a).max();
//        isPresent로 check
        if(oi.isPresent()){

        }else{

        }
        System.out.println(oi.orElseThrow(()->new NullPointerException("no value")));

    }
}
