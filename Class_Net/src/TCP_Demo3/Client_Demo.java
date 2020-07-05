package TCP_Demo3;

import java.io.*;
import java.net.Socket;

/*案例需求
//客户端：数据来自于键盘录入, 直到输入的数据是886，发送数据结束
客户端：数据来自于文本文件,接收服务器反馈
//服务端：接收到数据在控制台输出
服务端：接受到的数据写入文本文件中，给出反馈
*/
public class Client_Demo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.187", 10086);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

/*        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
//            OutputStream so = s.getOutputStream();
//            so.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();
        }*/

        BufferedReader br=new BufferedReader(new FileReader("Class_Net\\client.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //读取结束后，要给出一个结束输出流的标记，不然服务器会一直等待读取
        s.shutdownOutput();

        //接收服务器反馈
        BufferedReader br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line1 ;
       // while ((line1= br2.readLine())!=null){
            System.out.println("服务器的反馈："+br2.readLine());
        //}

        br.close();
        s.close();
    }

}
