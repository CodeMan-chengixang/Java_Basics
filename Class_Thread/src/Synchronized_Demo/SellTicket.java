package Synchronized_Demo;

public class SellTicket implements Runnable{
    private int tickets=100;
    Object obj=new Object();
    @Override
    public void run() {
        synchronized (obj){
            while (true){
                if (tickets>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()
                            +"正在出售第"+tickets+"张票");
                    tickets--;

                }
            }
        }

    }
}
