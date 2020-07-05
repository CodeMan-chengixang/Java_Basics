import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdress_Demo1 {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("wind");
        InetAddress address = InetAddress.getByName("192.168.31.187");

        String hostAddress = address.getHostAddress();
        String hostName = address.getHostName();

        System.out.println(hostAddress);//192.168.31.187
        System.out.println(hostName);//wind
    }
}
