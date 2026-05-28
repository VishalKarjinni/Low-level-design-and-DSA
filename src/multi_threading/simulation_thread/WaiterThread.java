package multi_threading.simulation_thread;

public class WaiterThread extends Thread {
    private final Object lock;

    public WaiterThread (Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.println("Waiter : waiting for the food to be ready... " );
                lock.wait();
                System.out.println("Waiter : Food is ready ! Delivering to the customer.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
