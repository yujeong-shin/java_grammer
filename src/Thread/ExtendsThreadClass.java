package Thread;

public class ExtendsThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("ExtendsThreadClass : " + Thread.currentThread().getName());
    }
}
