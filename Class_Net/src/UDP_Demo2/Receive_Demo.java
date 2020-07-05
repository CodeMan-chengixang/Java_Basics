package UDP_Demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收*/
public class Receive_Demo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10000);

        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
            ds.receive(dp);
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println(s);
        }


//        ds.close();
    }
}
