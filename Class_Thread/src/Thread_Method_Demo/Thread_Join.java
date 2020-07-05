package Thread_Method_Demo;

//void join()等待这个线程死亡
public class Thread_Join extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
