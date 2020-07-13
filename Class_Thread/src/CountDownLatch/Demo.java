package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) {
        //1、创建CountDownLatch对象，参数是需要等待的线程数量3，需要传递给4个线程（含一个在等待的线程）
        CountDownLatch countDownLatch = new CountDownLatch(3);

        //2、创建3个小孩线程作为需要等待的线程、1个妈妈线程作为在等待的线程
        Thread motherThread = new Thread(() -> {
            //1、等待3个小孩吃完饺子
            System.out.println(Thread.currentThread().getName() + "正在等待。。。");
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //2、收拾碗筷
            System.out.println(Thread.currentThread().getName() + "正在收拾碗筷");
        }, "妈妈");

        Thread childThread1 = new Thread(() -> {
            //1、吃饺子
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "正在吃第" + i + "个饺子");
            }

            //2、告诉妈妈一声，吃完了
            System.out.println(Thread.currentThread().getName()+"吃完了");
            countDownLatch.countDown();
        }, "小明");

        Thread childThread2 = new Thread(() -> {
            //1、吃饺子
            for (int i = 1; i <= 16; i++) {
                System.out.println(Thread.currentThread().getName() + "正在吃第" + i + "个饺子");
            }

            //2、告诉妈妈一声，吃完了
            System.out.println(Thread.currentThread().getName()+"吃完了");
            countDownLatch.countDown();
        }, "小红");

        Thread childThread3 = new Thread(() -> {
            //1、吃饺子
            for (int i = 1; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName() + "正在吃第" + i + "个饺子");
            }

            //2、告诉妈妈一声，吃完了
            System.out.println(Thread.currentThread().getName()+"吃完了");
            countDownLatch.countDown();
        }, "小刚");

        //开启4个线程
        motherThread.start();
        childThread1.start();
        childThread2.start();
        childThread3.start();
    }
}
