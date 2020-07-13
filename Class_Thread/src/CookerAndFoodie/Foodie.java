package CookerAndFoodie;

/**
 * 消费者：吃货线程
 */
public class Foodie implements Runnable {
    private Desk desk;

    public Foodie(Desk desk) {
        this.desk = desk;
    }

    /*
            步骤：
            1、判断桌子上有没有汉堡
                没有： 等待
                有： 开吃
            2、吃完之后：
                更改桌子的标记
                唤醒等待的生产者继续生产
                总汉堡数量减一
         */
    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getCount() == 0) {
                    break;
                } else {
                    if (desk.getFlag()) {
                        //有
                        System.out.println("吃货正在吃第" + (10 - desk.getCount() + 1) + "个汉堡");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();
                        desk.setCount(desk.getCount()-1);
                    } else {
                        //没有
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
