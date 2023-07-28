package threading;

public class FirstThreadRepeatedStarts extends Thread {

    @Override
    public void run() {
        System.out.println("My thread id is : " + Thread.currentThread().getId());
        System.out.println("My thread name is : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("My thread id is : " + Thread.currentThread().getId());
        System.out.println("My thread name is : " + Thread.currentThread().getName());

        FirstThreadRepeatedStarts firstThread = new FirstThreadRepeatedStarts();

        firstThread.start();

        // wait for completion of spawned thread execution
        Thread.sleep(2_000);

        // trying to start again, which should give exception for some failure.
        firstThread.start();
    }
}
