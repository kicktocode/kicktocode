package threading;

public class FirstThreadWithSleep extends Thread {

    @Override
    public void run() {
        System.out.println("My thread id is : " + Thread.currentThread().getId());

        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("My thread name is : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("My thread id is : " + Thread.currentThread().getId());
        System.out.println("My thread name is : " + Thread.currentThread().getName());

        FirstThreadWithSleep firstThread = new FirstThreadWithSleep();
        firstThread.start();
        System.out.println("Just after spawning my thread");
    }
}
