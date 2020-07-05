package TCP_Demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client_Demo {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.31.187",10010);
        OutputStream so = s.getOutputStream();
        so.write("Hello,TCP,我来了".getBytes());
        s.close();
    }
}
