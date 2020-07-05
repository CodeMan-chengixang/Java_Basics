package Practice;

import java.io.FileOutputStream;
import java.io.IOException;

/*【代码题】
描述:利用字节输出流一次写一个字节数组的方式
向D盘的b.txt文件输出内容:"i love java"*/
public class Practice_Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\software\\b.txt");
        byte[] bytes = "i love java".getBytes();
        fos.write(bytes);
        fos.close();
    }
}
