package TCP_Demo4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*案例需求
客户端：数据来自于文本文件，接收服务器反馈
服务器：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程*/
public class Server_Demo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        while (true){
            Socket s = ss.accept();
            new Thread(new serverThread(s)).start();
        }
    }
}
