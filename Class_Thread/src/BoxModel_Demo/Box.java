package BoxModel_Demo;

public class Box {
    private int milk;
    //定义一个成员变量，表示奶箱的状态
    private boolean state = false;

    public synchronized void put(int milk) {
        if (state) {
            //状态有牛奶，则进入if，等待消费
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //没有牛奶，则进入else，生产牛奶
        this.milk = milk;
        System.out.println("送奶工正在把第" + this.milk + "瓶牛奶放进奶箱");
        //生产之后，更改奶箱状态
        state = true;
        //更改完奶箱状态后，要解除等待，唤醒其他线程
        notifyAll();

    }

    public synchronized void get() {
        if (!state) {
            //表示没有牛奶，则等待生产
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //状态为true，表示有牛奶，消费牛奶
        System.out.println("消费者拿到第" + this.milk + "瓶牛奶");
        //消费之后，更改奶箱状态
        state = false;
        //更改完奶箱状态后，要解除等待，唤醒其他线程
        notifyAll();

    }
}
