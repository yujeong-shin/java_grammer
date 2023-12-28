package Thread;

public class MainClass {
    public static void main(String[] args) {
////        쓰레드 생성방법 1. Thrad를 상속한 클래스 객체 실행
//        Thread th1 = new ExtendsThreadClass();
////        start가 실행되자마자 run메서드가 자동실행
//        th1.start();
//
//        Thread th2 = new ExtendsThreadClass();
////        start가 실행되자마자 run메서드가 자동실행
//        th2.start();
//
//        Thread th3 = new ExtendsThreadClass();
////        start가 실행되자마자 run메서드가 자동실행
//        th3.start();
//
//        Thread rt = new Thread(new RunnableImplementsClass()); //run메서드를 주입
//        rt.start();


//        thread의 동시성 이슈 테스트
////        단일 스레드
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }
//        System.out.println("최종 책 수량 " + Library.bookcount);


        for (int i = 0; i < 1000; i++) {
            Thread th = new Thread(new Runnable() {
                @Override
                public void run() {
                    Library.borrow();
                }
            });
            th.start();
//            동시성 이슈 해결
//            방법 2 - join메서드 사용(스레드 생성 시)
//            try {
////                join은 한 스레드가 종료될 때까지 다른 스레드의 생성을 막음.
//                th.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println("최종 책 수량 " + Library.bookcount);
    }
}
