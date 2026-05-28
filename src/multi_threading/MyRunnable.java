package multi_threading;

public class MyRunnable implements Runnable{

    // Implementation of Runnable interface by using the Runnable interface getting
    // achieve the multiple inheritance.

    @Override
    public void run() {
        for (int i = 0; i <= 5 ; i++) {
            System.out.println("Runnable Thread : " + Thread.currentThread().getId() + " is running ");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
