package multi_threading;

public class SharedResource {
    synchronized void waitExample() {
        System.out.println(Thread.currentThread().getName() + " is waiting... ");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " resume after notify. ");
    }

    synchronized void notifyExample() {
        System.out.println("Notifying the waiting thread... ");
        notify();
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(sharedResource::waitExample, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                sharedResource.notifyExample();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }, "Thread - 2");

        t1.start();
        t2.start();
    }
}
