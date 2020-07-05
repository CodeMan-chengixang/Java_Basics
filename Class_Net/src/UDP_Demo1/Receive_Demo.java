package UDP_Demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*使用UDP接收数据步骤：
    1、创建DatagramSocket对象，并指定接收端口
    2、创建数据包DatagramPacket对象，用于接收数据
    3、调用DatagramSocket对象的receive（）方法接收数据
    4、从数据包中解析数据
       调用数据包DatagramPacket对象的
       getData（）方法，获取数据缓冲区
       getLength（）方法，获取接收的数据长度
    5、关闭接收端
* */
public class Receive_Demo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);

        byte[] bytes = new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);

        ds.receive(dp);

        String dateString = new String(dp.getData(), 0, dp.getLength());
        System.out.println(dateString);

        ds.close();
    }
}
