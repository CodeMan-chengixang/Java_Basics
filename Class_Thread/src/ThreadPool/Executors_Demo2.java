package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_Demo2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"执行了");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"执行了");
        });
        executorService.shutdown();

    }
}
