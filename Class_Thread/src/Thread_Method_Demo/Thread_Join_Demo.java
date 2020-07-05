package Thread_Method_Demo;

//void join()等待这个线程死亡
public class Thread_Join_Demo {
    public static void main(String[] args) {
        Thread_Join tj1=new Thread_Join();
        Thread_Join tj2=new Thread_Join();
        Thread_Join tj3=new Thread_Join();

        tj1.setName("康熙");
        tj2.setName("四阿哥");
        tj3.setName("八阿哥");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//tj1线程启动后，要等待这个线程死亡，后面的线程才能启动
        tj2.start();
        tj3.start();

    }
}
