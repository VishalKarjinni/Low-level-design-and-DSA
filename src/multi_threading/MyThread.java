package multi_threading;

public class MyThread extends Thread {
    // Extending the Thread Behaviour
    @Override
    public void run() {
       for (int i = 0; i <= 5; i++) {
           System.out.println("Thread " + Thread.currentThread().getId() + " is running " + i);
           try {
               Thread.sleep(500); //pause for 500 milliseconds
           } catch (Exception e) {
               System.out.println("Thread Interrupted");
           }
       }
    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();
    }
}
