package TCP_Demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Demo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10010);
        Socket s = ss.accept();
        InputStream si = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = si.read(bytes);
        String data = new String(bytes, 0,len);
        System.out.println(data);
        ss.close();
    }
}
