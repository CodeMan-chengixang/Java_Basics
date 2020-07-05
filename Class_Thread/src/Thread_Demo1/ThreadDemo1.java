package Thread_Demo1;

public class ThreadDemo1 {
    public static void main(String[] args) {
//        ThreadPriority mt1 = new ThreadPriority();
//        ThreadPriority mt2 = new ThreadPriority();

//        //直接通过setName（）方法更改线程名称
//        mt1.setName("高铁");
//        mt2.setName("飞机");

        //通过带参构造方法Thread（String name）给线程命名，
        // 要先在定义的线程类Mythread中提供带参构造方法,通过super访问父类的带参构造方法
        MyThread mt1=new MyThread("高铁");
        MyThread mt2=new MyThread("飞机");

        //start()方法导致此线程开始执行，并由JAVA虚拟机调用此线程的run（）方法
        mt1.start();
        mt2.start();

        //Thread.currentThread()返回对当前正在执行的线程对象的引用
        String name = Thread.currentThread().getName();//main
        //获取到main方法的当前执行的线程的名称
        System.out.println(name);
    }
}
