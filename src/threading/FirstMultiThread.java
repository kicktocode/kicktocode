package threading;

public class FirstMultiThread implements Runnable {

    private int num;

    public FirstMultiThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Started thread name : " + Thread.currentThread().getName() + ", time = " + System.currentTimeMillis());
        if (num % 2 != 0) {
            try {
                Thread.sleep(num * 1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End thread name : " + Thread.currentThread().getName() + ", time = " + System.currentTimeMillis());
    }
}

class TestMultiThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Just started thread name : " + Thread.currentThread().getName());
        Thread temp;
        for (int i = 0; i < 10; i++) {
            temp = new Thread(new FirstMultiThread(i));
            temp.start();
        }
        System.out.println("End thread name : " + Thread.currentThread().getName());
    }
}
