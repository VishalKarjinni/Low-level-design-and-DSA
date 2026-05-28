package multi_threading.thread_lifecycle_pools;

public class Task implements Runnable {
    private final int taskId;

    public Task (int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Starting Task " + taskId);
        try {
            Thread.sleep(2000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Waiting for thread " + taskId);
                this.wait(1000);
            }
            System.out.println(Thread.currentThread().getName() + " - Task " + taskId + " Completed");
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }
}
