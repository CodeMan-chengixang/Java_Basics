package Practice;

import java.io.FileInputStream;
import java.io.IOException;

/*【代码题】
描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
,使用循环读取，一次读取一个字节数组，直到读取到文件末尾，
将读取到的字节数组转换成字符串输出到控制台。*/
public class Practice_Demo5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("c:/software/b.txt");
        byte[] bys=new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        fis.close();
    }
}
