package TCP_Demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/*案例需求

        客户端：发送数据，接受服务器反馈

        服务器：收到消息后给出反馈*/
public class Client_Demo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.31.187",10010);
        //发送数据
        OutputStream so = s.getOutputStream();
        so.write("你好，TCP，我来了".getBytes());

        //接收服务器的反馈
        InputStream si = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len=si.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("客户端接收反馈："+data);

        s.close();
    }
}
