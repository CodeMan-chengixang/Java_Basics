import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*### 3字符串中的编码解码问题【应用】
- 相关方法
编码：
  | byte[] getBytes()                        | 使用平台的默认字符集将该 String编码为一系列字节    |
  | byte[] getBytes(String charsetName)      | 使用指定的字符集将该 String编码为一系列字节        |
解码：
  | String(byte[] bytes)                     | 使用平台的默认字符集解码指定的字节数组来创建字符串 |
  | String(byte[] bytes, String charsetName) | 通过指定的字符集解码指定的字节数组来创建字符串     |*/
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
        //编码
        //byte[] getBytes()用平台的默认字符集将该 String编码为一系列字节
        byte[] bytes1 = s.getBytes();
        System.out.println(Arrays.toString(bytes1));//[-28, -72, -83, -27, -101, -67]

        //byte[] getBytes(String charsetName)使用指定的字符集将该 String编码为一系列字节
        byte[] bytes2 = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes2));//[-28, -72, -83, -27, -101, -67]
        byte[] bytes3 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes3));//[-42, -48, -71, -6]

        //解码
        //String(byte[] bytes)使用平台的默认字符集解码指定的字节数组来创建字符串
        System.out.println(new String(bytes1));//中国
        //String(byte[] bytes, String charsetName)通过指定的字符集解码指定的字节数组来创建字符串
        System.out.println(new String(bytes1,"UTF-8"));//中国
        System.out.println(new String(bytes1,"GBK"));//涓浗//乱码
        System.out.println(new String(bytes3,"GBK"));//中国

    }
}
