package Lock_Demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
解决方法二：Lock锁实现
    try{
        锁名称.lock();
        要实现同步的代码块
    }finally{
         锁名称.unlock()；
    }
*/
public class SellTicket implements Runnable {
    private int tickets = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            }finally {
                lock.unlock();
            }

        }
    }

}

