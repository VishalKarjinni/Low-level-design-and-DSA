package multi_threading.simulation_thread;

public class ChefThread extends Thread{
    private final Object lock;

    public ChefThread (Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            synchronized (lock) {
                System.out.println("chef : food is ready! Notifying the waiter.");
                lock.notify();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
