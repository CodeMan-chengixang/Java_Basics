package TCP_Demo4;

import java.io.*;
import java.net.Socket;

/*案例需求
客户端：数据来自于文本文件，接收服务器反馈
服务器：接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程*/
public class Client_Demo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.187", 10086);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("Class_Net\\client.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        //接收反馈
        BufferedReader brServer = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line0;
        while ((line0 = brServer.readLine()) != null) {
            System.out.println(line0);
        }

        s.close();
        br.close();

    }
}
