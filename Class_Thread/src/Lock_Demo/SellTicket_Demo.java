package Lock_Demo;
/*案例需求
某电影院目前正在上映国产大片，共有100张票，
而它有3个窗口卖票，请设计一个程序模拟该电影院卖票*/

/*案例思考：
   在实际生活中，买票时出票是需要时间的，所以在出售一张票的时候需要时间延迟
   我们用sleep（）方法实现，每次出票时间100毫秒

   结果出现问题：
   1、同一张票多次出售
   2、出现了负数票
   线程执行的随机性导致的
*/


/*
解决方法二：Lock锁实现
    try{
        锁名称.lock();
        要实现同步的代码块
    }finally{
         锁名称.unlock()；
    }
*/
public class SellTicket_Demo {
    public static void main(String[] args) {
        SellTicket st=new SellTicket();

        Thread t1=new Thread(st,"1号窗口");
        Thread t2=new Thread(st,"2号窗口");
        Thread t3=new Thread(st,"3号窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}
