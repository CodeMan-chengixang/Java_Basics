package TCP_Demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*案例需求

        客户端：发送数据，接受服务器反馈

        服务器：收到消息后给出反馈*/
public class Server_Demo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10010);

        //接收数据
        Socket s = ss.accept();
        InputStream si = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = si.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println(data);

        //给出反馈
        OutputStream so = s.getOutputStream();
        so.write("服务器已接收到数据".getBytes());

        ss.close();

    }
}
