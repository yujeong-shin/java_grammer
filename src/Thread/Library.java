package Thread;

public class Library {
    static int bookcount=100;
    //   동시성 이슈 해결
//   방법 1 - join메서드 사용(스레드 생성 시)
//   synchronized 키워드를 통해 borrow 메서드의 동시실행 방지
    static synchronized void borrow(){
        if(bookcount>0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookcount -= 1;
            System.out.println("대출 완료");
            System.out.println("남아 있는 책 수량 : " + bookcount);
        }
        else{
            System.out.println("대출 불가");
        }
    }
}