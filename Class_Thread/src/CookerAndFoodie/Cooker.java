package CookerAndFoodie;
/*
生产者：厨师线程
 */
public class Cooker implements Runnable {
    private Desk desk;

    public Cooker(Desk desk) {
        this.desk=desk;
    }

    /*
        步骤：
        1、判断桌子上是否有汉堡包
           有：等待
           没有：生产
        2、生产之后：
            更改桌子的标记
            唤醒等待的消费者线程
         */
    @Override
    public void run() {
        while (true){
            synchronized (desk.getLock()){
                if (desk.getCount()==0){
                    break;
                }else {
                    if (desk.getFlag()){
                        //有
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //没有
                        System.out.println("厨师正在生产第"+(10-desk.getCount()+1)+"个汉堡");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    }
                }
            }
        }

    }
}
