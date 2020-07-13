package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_Demo {
    public static void main(String[] args) throws InterruptedException {
        //创建阻塞队列的对象，容量为2
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(2);

        //存放元素
        arrayBlockingQueue.put("汉堡包1");
       // arrayBlockingQueue.put("汉堡包2");
        //arrayBlockingQueue.put("汉堡包3");//超过容量，元素放不进去，会被阻塞


        //取出元素
        System.out.println( arrayBlockingQueue.take());
        System.out.println( arrayBlockingQueue.take());
        //System.out.println( arrayBlockingQueue.take());//取不出元素，会被阻塞

        System.out.println("程序结束了");
    }
}
