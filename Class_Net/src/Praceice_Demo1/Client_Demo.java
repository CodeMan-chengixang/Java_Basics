package Praceice_Demo1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*4、
需求说明：创建新项目，按以下要求编写代码：
在项目下创建TCP 服务器端 端口号为8888
1:等待客户端连接   如果有客户端连接  获取到客户端对象
2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据*/
public class Client_Demo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.31.187", 8888);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write("客户端发送的数据");
        bw.newLine();
        bw.flush();
        s.close();
    }
}
