package multi_threading.thread_pools;

import multi_threading.MyCallable;
import multi_threading.simulation_thread.WaiterThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            executorService.submit(new WorkerThread(i));
        }
        executorService.shutdown();
    }
}
