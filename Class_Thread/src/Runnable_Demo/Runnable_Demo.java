package Runnable_Demo;

//Thread(Runnable target)分配一个新的Thread对象
// Thread(Runnable target, String name)分配一个新的Thread对象
public class Runnable_Demo {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();

//        //Thread(Runnable target)分配一个新的Thread对象
//        Thread t1=new Thread(mr);
//        Thread t2=new Thread(mr);

        //Thread(Runnable target,String name)分配一个新的Thread对象
        Thread t1=new Thread(mr,"飞机");
        Thread t2=new Thread(mr,"高铁");

        t1.start();
        t2.start();

    }
}
