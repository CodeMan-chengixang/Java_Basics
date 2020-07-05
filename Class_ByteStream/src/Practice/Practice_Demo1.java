package Practice;

import java.io.FileOutputStream;
import java.io.IOException;

/*【代码题】
描述:利用字节输出流一次写一个字节的方式，
向D盘的a.txt文件输出字符‘a’。*/
public class Practice_Demo1 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\software\\a.txt");
        fos.write("abcdfe".getBytes());
        fos.close();
    }
}
