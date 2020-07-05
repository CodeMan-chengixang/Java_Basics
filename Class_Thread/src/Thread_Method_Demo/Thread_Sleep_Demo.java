package Thread_Method_Demo;

//static void sleep(long millis)
// 使当前正在执行的线程停留（暂停执行）指定的毫秒数
public class Thread_Sleep_Demo {
    public static void main(String[] args) {
        Thread_Sleep ts1=new Thread_Sleep();
        Thread_Sleep ts2=new Thread_Sleep();
        Thread_Sleep ts3=new Thread_Sleep();

        ts1.setName("刘备");
        ts2.setName("曹操");
        ts3.setName("孙权");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
