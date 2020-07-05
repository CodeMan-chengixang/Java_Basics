package Class_Byte_InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
字节流读数据（一次读取一个字节数组数据）
int read​(byte[] b)：
     从该输入流读取最多 b.length个字节的数据到一个字节数组。
int read​(byte[] b, int off, int len)：
     从该输入流读取最多 len个字节的数据到字节数组。

需求：把文件fos4.txt中的内容读取出来在控制台输出
* */
public class Byte_InputStream_Dem03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Class_ByteStream\\fos4.txt");
/*        byte[] by = new byte[5];

        //第一次读取数据
        int len = fis.read(by);
        System.out.println(len);//5
        //通过String类中的带参构造方法String（byte[]）
        //将字节数组转化为字符串
        //System.out.println(new String(by));//hello
        System.out.println(new String(by,0,len));//hello
        //第二次读取
        len = fis.read(by);
        System.out.println(len);//5
        //System.out.println(new String(by));// \r\n   wor(因为有换行符，也读取到了)
        System.out.println(new String(by,0,len));//\r\nwor
           *//*
            hello\r\n
            world\r\n
            *//*
        //第三次读取
        len = fis.read(by);
        System.out.println(len);//2(说明这个len，返回的是实际读取到的字符的个数)
        //System.out.println(new String(by));//ldwor（只转换了2个字符ld，后面的是wor是没有转换的）
        //为了读到几个字符就转几个字符，使用String的另一个构造方法
        //String​(byte[] bytes, int offset, int length)
        // 通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 。
        System.out.println(new String(by,0,len));//ld*/

        //用循环改进
        byte[] bys=new byte[1024];//长度一般给1024，及其整数倍
        int lenth;
        while ((lenth=fis.read(bys))!=-1){
            System.out.print(new String(bys,0,lenth));
        }


        fis.close();
    }

}
