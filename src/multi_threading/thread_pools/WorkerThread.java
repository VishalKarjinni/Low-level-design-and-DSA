package multi_threading.thread_pools;

public class WorkerThread implements Runnable{
    private final int taskId;

    public WorkerThread (int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is processing task: " + taskId);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            System.out.println("Task Interrupted " + exception.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " Final task " + taskId);
    }
}
