package Practice;

import java.io.FileInputStream;
import java.io.IOException;

/*【代码题】
描述:利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
,使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台*/
public class Practice_Demo4 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("C:\\software\\a.txt");
        int by;
        while ((by=fis.read())!=-1){
            System.out.print((char)by);
        }
        fis.close();
    }

}
