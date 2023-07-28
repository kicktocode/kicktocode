package threading;

public class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("My thread id is : " + Thread.currentThread().getId());
        System.out.println("My thread name is : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("My thread id is : " + Thread.currentThread().getId());
        System.out.println("My thread name is : " + Thread.currentThread().getName());

        FirstThread firstThread = new FirstThread();
        firstThread.run();

        Thread.sleep(2_000);

        firstThread.start();
    }
}
