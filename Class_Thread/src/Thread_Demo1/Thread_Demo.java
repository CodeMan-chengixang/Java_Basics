package Thread_Demo1;

public class Thread_Demo {
    public static void main(String[] args) {
        /*
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("小明");
        t2.setName("小菜");
        */

        MyThread t1 = new MyThread("小明");
        MyThread t2 = new MyThread("小菜");
        t1.start();
        t2.start();
    }




}
