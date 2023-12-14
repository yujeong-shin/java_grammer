package C12ClassLecture;

public class C1201Method {
    public static void main(String[] args) {
////        for문을 이용해서 1~10까지 total값 출력
//        int total = 0;
//        for (int i = 1; i <= 10; i++) {
//            total += i;
//        }
//        System.out.println(total);
//
//        //for문을 이용해서 10~20까지 total값 출력
//        int total2 = 0;
//        for (int i = 10; i <= 20; i++) {
//            total2 += i;
//        }
//        System.out.println(total2);

//        코드의 중복이 발생하므로, 코드의 반복을 피하기 위해 특정 기능 집합을 별도로 분리
        int total = sumAcc(100, 200);
        System.out.println(total);

//        같은 클래스 내의 메서드들 사이에서의 호출은 static 메서드라 할지라도 클래스명 생략가능
        System.out.println(C1201Method.sumAcc(1, 10));

//        메서드 구성요소 : 매개변수, 반환타입, 접근제어자, 클래스메서드여부(static)

    }

//    void 리턴타입 : 리턴타입 없는 것
//    int, String 등 리턴타입 명시
    static int sumAcc(int start, int end){
        int total=0;
        for (int i = start; i < end; i++) {
            total += i;
        }
//        return 키워드를 통해서 연산결과값을 반환
        return total;
    }
}
