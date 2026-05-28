package multi_threading;

import java.util.concurrent.*;

public class MyCallable implements Callable<String> {

    private final String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 5; i++) {
            result.append("Callable ")
                    .append(name)
                    .append(" is running ")
                    .append(i)
                    .append(" ");
            Thread.sleep(500);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Create ExecutorService with fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // create callable instances
        Callable<String> callable1 = new MyCallable("Task-1");
        Callable<String> callable2 = new MyCallable("Task-2");

        try {
            Future<String> future1 = executorService.submit(callable1);
            Future<String> future2 = executorService.submit(callable2);

            System.out.println("Result from first task");
            System.out.println(future1.get());

            System.out.println("Result from second task");
            System.out.println(future2.get());
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }
}
