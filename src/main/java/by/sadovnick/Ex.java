package by.sadovnick;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex {
    private static int counter1 = 0;
    private static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {
        int taskCounnt = 100_000;
        CountDownLatch latch = new CountDownLatch(taskCounnt);
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < taskCounnt; i++) {
            executorService.submit(() -> {
                counter1++;
                counter2++;
                latch.countDown();
            });
        }
        latch.await();
        System.out.println(counter1);
        System.out.println(counter2);
        System.exit(0);
    }
}
