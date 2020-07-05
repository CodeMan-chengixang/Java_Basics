package Thread_Method_Demo;

//static void sleep(long millis)
// 使当前正在执行的线程停留（暂停执行）指定的毫秒
public class Thread_Sleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }//使当前正在执行三个线程，暂停执行1000毫秒
        }
    }
}
