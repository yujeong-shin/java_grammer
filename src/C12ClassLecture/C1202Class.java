package C12ClassLecture;

public class C1202Class {
    public static void main(String[] args) {
//        매개변수 2개 받아서 더한 값 return sum
        System.out.println(MyCalculator.sum(10,20));

//        A부서의 매출
        MyCalculator.sum_acc(10);
        MyCalculator.sum_acc(20);
        MyCalculator.sum_acc(30);
        System.out.println(MyCalculator.total);

//       B부서의 매출
        MyCalculator.sum_acc(10);
        MyCalculator.sum_acc(20);
        MyCalculator.sum_acc(30);
//        클래스 변수를 공용으로 사용하다보니, 변수와 메서드에 고유성이 보장되지 않음
        System.out.println(MyCalculator.total);


//        A부서의 매출
        MyCalInstance myCalA = new MyCalInstance();
        myCalA.sum_acc(10);
        myCalA.sum_acc(20);
        myCalA.sum_acc(30);
        System.out.println(myCalA.total);


        //B부서의 매출
        MyCalInstance myCalB = new MyCalInstance();
        myCalB.sum_acc(10);
        myCalB.sum_acc(20);
        myCalB.sum_acc(30);
        System.out.println(myCalB.total);

    }

}

//내부클래스
class MyCalculator {
    static int total = 0;

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum_acc(int a) {
        total += a;
        return total;
    }
}

class MyCalInstance {
//    static이 붙어있는 변수는 클래스변수, static이 붙어있지 않으면 객체변수
    int total = 0;

    int sum(int a, int b) {
        return a + b;
    }

    int sum_acc(int a) {
//        this는 객체 그 자신을 의미
        total += a;
        return total;
    }
}