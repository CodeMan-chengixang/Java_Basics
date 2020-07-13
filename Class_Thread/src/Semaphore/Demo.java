package Semaphore;

import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        //1、创建管理员对象，参数2，最多允许2条线程访问
        Semaphore  semaphore = new Semaphore(2);

        //2、创建50条线程并开启
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                //1、获得通行证
                try {
                    semaphore.acquire();
                    //2、开始行使
                    System.out.println("获得了通行证开始行使");
                    Thread.sleep(200);
                    //3、归还通行证
                    System.out.println("归还通行证");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
