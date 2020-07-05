package Thread_Method_Demo;

public class Thread_Daemon extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
