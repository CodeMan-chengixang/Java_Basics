package UDP_Demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/*案例需求
UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收*/
public class Send_Demo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket
                    (bytes, bytes.length, InetAddress.getByName("192.168.31.187"), 10000);
            ds.send(dp);
        }
        ds.close();
    }
}
