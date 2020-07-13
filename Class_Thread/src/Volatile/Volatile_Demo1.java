package Volatile;

import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Thread.sleep;

public class Volatile_Demo1 {
    //public static int money = 10;
    //1、问题： t2修改money为9，t1中的money值没有更新，还是10

    //public static volatile int money = 10;//金额不是十万了，是9万
    //2、解决一：共享数据使用volatile关键字修饰，t2修改money为9，t1中的money也更新为9

    public static int money = 10;
    public static final Object lock = new Object();//金额不是十万了，是9万
    //3、解决二：使用synchronized同步代码块解决,t2修改money为9，t1中的money也更新为9

    public static void main(String[] args) {
/*

        Thread t1 = new Thread(() -> {
            while (money == 10) {

            }
            System.out.println("金额不是十万了，是"+money+"万");
        });
*/

        Thread t1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (money == 10) {

                    }else {
                        System.out.println("金额不是十万了，是"+money+"万");
                        break;
                    }
                }
            }
        });

        /*
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money = 9;
        });
        */

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money = 9;
            }
        });

        t1.start();
        t2.start();

        ConcurrentHashMap concurrentHashMap =new ConcurrentHashMap();
    }
}
