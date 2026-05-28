package multi_threading.thread_lifecycle_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolLifeCycleDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Thread Pool created");

        for (int i = 0; i <= 5; i++) {
            executorService.submit(new Task(i));
        }

        executorService.shutdown();
        System.out.println("Thread Pool Shutdown initiated : ");

        try {
            if (executorService.awaitTermination(10, TimeUnit.DAYS)) {
                executorService.shutdown();
                System.out.println("Forcing Shutdown ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("All Threads Terminated ");
    }
}
