package concurrency_interview_problems.buzz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainGame {
    public static void main(String[] args) {
        int n = 20;
        FizzBuzz fizzBuzz = new FizzBuzz(n);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(() -> {
            try {
                fizzBuzz.fizz(() -> {
                    System.out.println("Fizz (" + Thread.currentThread().getName() + ") ");
                });
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });


        executorService.submit(() -> {
            try {
                fizzBuzz.buzz(() -> {
                    System.out.println("Buzz (" + Thread.currentThread().getName() + ") ");
                });
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executorService.submit(() ->  {
            try {
                fizzBuzz.fizzBuzz(() -> {
                    System.out.println("FizzBuzz (" + Thread.currentThread().getName() + ") ");
                });
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executorService.submit(() -> {
            try {
                fizzBuzz.number(num -> {
                    System.out.println(num + " (" + Thread.currentThread().getName() + ") ");
                });
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }
}
