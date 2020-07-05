package UDP_Demo1;

import java.io.IOException;
import java.net.*;

/*使用UDP发送数据步骤：
   1、创建发送端socket对象（DatagramSocket）
   2、创建数据，并将数据打包（DatagramPacket）
   3、调用对象的发送方法，发送数据
   4、关闭发送端
* */
public class Send_Demo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        byte[] bytes = "hello，UDP，我来了".getBytes();
        DatagramPacket dp=new DatagramPacket
                (bytes,bytes.length, InetAddress.getByName("192.168.31.187"),10086);
        ds.send(dp);
        ds.close();
    }
}
