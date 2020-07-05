package TCP_Demo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*案例需求
//客户端：数据来自于键盘录入, 直到输入的数据是886，发送数据结束
客户端：数据来自于文本文件,接收服务器反馈
//服务端：接收到数据在控制台输出
服务端：接受到的数据写入文本文件中,给出反馈
*/
public class Server_Demo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        Socket s = ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("Class_Net\\tcp.txt"));
        String line;
        while ((line=br.readLine())!=null){
//            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();

        }

        //给出反馈
        BufferedWriter bw2=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw2.write("文件上传成功");
        bw2.newLine();
        bw2.flush();

        bw.close();
        ss.close();
    }
}
