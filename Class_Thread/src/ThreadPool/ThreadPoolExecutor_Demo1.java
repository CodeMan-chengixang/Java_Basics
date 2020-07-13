package ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolExecutor_Demo1 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                3,
                20,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                //new ThreadPoolExecutor.AbortPolicy()
                //ThreadPoolExecutor.CallerRunsPolicy()
                //new ThreadPoolExecutor.DiscardOldestPolicy()
                new ThreadPoolExecutor.DiscardPolicy()//不推荐

        );

        for (int i = 1; i <=10; i++) {
            final int y = i;
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName()+"执行了"+y);
            });
        }

        threadPoolExecutor.shutdown();


    }
}
