package Callable_Demo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable_Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<String> ft =new FutureTask<>(mc);
        Thread t = new Thread(ft);
        t.start();
        String s = ft.get();
        System.out.println(s);
    }
}
