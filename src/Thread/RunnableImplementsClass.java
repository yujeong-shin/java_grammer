package Thread;

//Runnable을 구현하면 다중상속, 다중구현을 할 수 있는 장점이 Thread 상속보다 더 크다.
public class RunnableImplementsClass implements Runnable{
    @Override
    public void run() {
        System.out.println("RunnableImplementsClass : " + Thread.currentThread().getName());
    }
}
