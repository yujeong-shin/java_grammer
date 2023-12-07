import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
////        참조자료형 : 기본 자료형을 제외한 모든 자료형
////        Wrapper Class : 기본형 타입에는 없는 다양한 기능을 지원하기 위한 클래스
////        int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
////        오토언박싱 : Integer -> int 형변환
//        int c = b;
////        언박싱 : 래퍼 클래스를 래퍼 기본 자료형로 변환하는 과정
////        언박싱 : Integer -> int 형변환
//        int d = b.intValue();
////        오토박싱 : int -> Integer 형변환
//        Integer e = a;
////        박싱 : 기본 자료형을 래퍼 클래스로 변환하는 과정
////        int -> Integer 형변환
//        Integer f = Integer.valueOf(a);

////        String과 int의 형변환
//        int a = 10;
//        String st_a = Integer.toString(a); //"10"
//        int c = Integer.parseInt(st_a); //10
//
////        참조자료형에 원시자료형을 담을 때는 Wrapper 클래스를 써야한다.
////        ex) 컬렉션프레임워크(List, Set, Map, ...)
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);

////        String pool, String 객체
////        리터럴 방식을 사용하는 것이 최적화에 도움
//        String mySt1 = new String("hello"); //String pool에 생성
//        String mySt2 = new String("hello"); //mySt1과 주소 공유
//        String mySt3 = "hello";
//        String mySt4 = "hello";
//        String mySt5 = mySt1;
//        System.out.println(mySt1==mySt2);
//        System.out.println(mySt1==mySt3);
//        System.out.println(mySt3==mySt4);
//        System.out.println(mySt1==mySt5);
//
//        System.out.println(mySt1.equals(mySt2));
//        System.out.println(mySt1.equals(mySt3));
//        System.out.println(mySt3.equals(mySt4));
//        System.out.println(mySt1.equals(mySt5));

//        List<String> myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("hello2");
//
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("hello3");
//        System.out.println(mySt2);

////        문자열의 길이 : length();
//        String mySt = " hello ";
//        System.out.println(mySt.length());
//
////        indexOf : 특정 문자열의 위치 반환
//        String mySt2 = "hello java";
//        System.out.println(mySt2.indexOf('e'));
//
////        contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        String str = "hello";
//        System.out.println(mySt2.contains(str));

////        charaAt : 문자열에서 특정 위치(index)의 문자를 return
//        String a = "hello";
//        char myChar = a.charAt(2);
//        System.out.println(myChar);

//        //charAt, length를 활용한 st안에 있는 문자 a의 개수
//        String st = "afcdefabaadf";
//        int count=0;
//        for (int i = 0; i < st.length(); i++) {
//            if(st.charAt(i)=='a') count++;
//        }
//        System.out.println(count);

////        substring(a, b) : a이상 b미만의 index를 자른다.
//        String st1 = "hello world";
//        System.out.println(st1.substring(0, 5));
//        System.out.println(st1.substring(6));

////        trim, strip
//        String trimSt = "      hello world       ";
//        String new_strimSt = trimSt.trim();
//        String stripSt = trimSt.strip();
//        System.out.println(new_strimSt);
//        System.out.println(stripSt);

////        toUpperCase : 대문자, toLowerCase : 소문자
//        String a = "Hello";
//        String a1 = a.toUpperCase();
//        String a2 = a.toLowerCase();
//        System.out.println(a1);
//        System.out.println(a2);

////        문자열 더하기 +=
//        String a = "hello";
//        a += "world";
//        System.out.println(a);

////        char -> String 형번환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);

////        숫자가 아닌 것들 없애기
//        String str = "92i21jkf209한글1312";
//        String str2 = str.replaceAll("[a-z가-힣^]", "");
//        System.out.println(str2);
//
//        String str3 = "";
//        for(char c : str.toCharArray()) {
//            if(!Character.isAlphabetic(c)) str3 += c;
//        }
//        System.out.println(str3);
//
////        [a-z] : 소문자 알파벳
//        String str4 = str.replaceAll("[a-z]", "");
//        System.out.println(str4);
////        [가-힣] : 한글
//        String str5 = str.replaceAll("[가-힣]", "");
//        System.out.println(str5);
////        [0-9] : 숫자
//        String str6 = str.replaceAll("[0-9]", "");
//        System.out.println(str6);
////        [a-zA-Z] : 알파벳 전체
//        String str7 = str.replaceAll("[a-zA-Z]", "");
//        System.out.println(str7);
////        [a-zA-Z0-9] : 알파벳 전쳬와 숫자
//        String str8 = str.replaceAll("[a-zA-Z0-9]", "");
//        System.out.println(str8);

//////        Pattern클래스
//        boolean matcher = Pattern.matches("[a-z]+", "helloworld");
//        System.out.println(matcher);

////        전화번호 검증
////        d : Digit, {} : 연속으로 나오는 숫자
//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-1234-1234");
//        //boolean matcher2 = Pattern.matches("^010-\\d{4}-\\d{4}$", "010-1234-1234");
//        //boolean matcher2 = Pattern.matches("^01\\d{1}-\\d{4}-\\d{4}$", "010-1234-1234");
//        System.out.println(matcher2);

////        이메일 검증
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "hello@naver.com");
//        System.out.println(matcher3);


////        replace(a,b) : a문자를 b문자로 대체
//        String str1 = "hello world";
//        String str2 = str1.replace("world", "java");
//        System.out.println(str2);
//
////        replaceAll(a,b)
//        String str3 = str1.replaceAll("l", "x");
//        System.out.println(str3);

////        split
//        String a = "a:b:c:d";
//        String[] stArr = a.split(":");
//        System.out.println(Arrays.toString(stArr));
//
//        String b = "a  b c d";
//        String[] stArr2 = b.split(" ");
//        System.out.println(Arrays.toString(stArr2));
////        문자 사이에 공백의 개수가 다를 때 해결 방법
//        String[] stArr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(stArr3));
//
//        String c = " a  b c d";
//        c = c.trim();
//        String[] stArr4 = b.split("\\s+");
//        System.out.println(Arrays.toString(stArr4));

////        isEmpty와 null구분
//        String st1 = null;
//        String st2 = "";
//
//        System.out.println(st1==null);
//        System.out.println(st2==null);
//
//        //System.out.println(st1.isEmpty()); //NullPointerException 에러 발생
//        System.out.println(st2.isEmpty());


    }
}
