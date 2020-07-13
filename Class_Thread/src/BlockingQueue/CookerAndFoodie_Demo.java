package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class CookerAndFoodie_Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        ReentrantLock lock = new ReentrantLock();
        Thread cooker = new Thread(()->{
            while (true){
                try {

                    bq.put("汉堡包");

                    System.out.println("厨师放入一个汉堡包");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread foodie = new Thread(()->{
            while (true){
                try {
                    String s = bq.take();
                    System.out.println("吃货吃掉一个"+s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        cooker.start();
        foodie.start();
    }

}
