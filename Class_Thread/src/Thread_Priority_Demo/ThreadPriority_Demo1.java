package Thread_Priority_Demo;

public class ThreadPriority_Demo1 {
    public static void main(String[] args) {
        ThreadPriority tp1=new ThreadPriority();
        tp1.setName("高铁");
        ThreadPriority tp2=new ThreadPriority();
        tp2.setName("飞机");
        ThreadPriority tp3=new ThreadPriority();
        tp3.setName("汽车");

//        //final int getPriority()返回此线程的优先级
//        System.out.println(tp1.getPriority());//5
//        System.out.println(tp2.getPriority());//5
//        System.out.println(tp3.getPriority());//5

        //final void setPriority(int newPriority)更改此线程的优先级
        // 线程默认优先级是5；线程优先级的范围是：1-10
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
