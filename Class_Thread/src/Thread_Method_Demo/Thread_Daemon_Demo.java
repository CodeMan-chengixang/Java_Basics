package Thread_Method_Demo;

//void setDaemon(boolean on)将此线程标记为守护线程，
// 当运行的线程都是守护线程时，Java虚拟机将退出
public class Thread_Daemon_Demo {
    public static void main(String[] args) {
        Thread_Daemon td1=new Thread_Daemon();
        Thread_Daemon td2=new Thread_Daemon();

        td1.setName("关羽");
        td2.setName("张飞");

        //设置主线程“刘备”
        Thread.currentThread().setName("刘备");
        //设置守护线程，
        // 当主线程运行结束后，运行的线程都是守护线程则退出Java虚拟机
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }





    }
}
