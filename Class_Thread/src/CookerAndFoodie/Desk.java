package CookerAndFoodie;

/*
共享数据：桌子的实体类，用来放置汉堡包
 */
public class Desk {
    //标记变量，判断是否有汉堡包
    //true 有：吃货执行
    //false 没有：厨师执行
    //public static Boolean flag = false;
    //改写成更加面向对象
    private Boolean flag;

    // 汉堡包的总数量（执行的次数）
    //public static int count = 10;
    //private int count = 10;
    private int count ;

    //锁对象 （生产者和消费者需要使用同一个锁对象）
    //public static final Object lock = new Object();
    private final Object lock = new Object();

    public Desk() {
        this(false,10);
    }

    public Desk(Boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }
}
