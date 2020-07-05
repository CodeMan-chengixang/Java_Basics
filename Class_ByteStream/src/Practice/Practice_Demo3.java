package Practice;

import java.io.FileOutputStream;
import java.io.IOException;

/*【代码题】
描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
在c.txt文件原内容基础上，添加五句 I love java，
而且要实现一句一行操作(注：原文不可覆盖)。
利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”*/
public class Practice_Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\software\\c.txt", true);
        fos.write("I love java\r\n".getBytes());
        fos.write("I love java\r\n".getBytes());
        fos.write("I love java\r\n".getBytes());
        fos.write("I love java\r\n".getBytes());
        fos.write("I love java\r\n".getBytes());
        fos.close();
    }
}
