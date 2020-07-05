package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*【代码题】
描述:利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
要求：
一次读写一个字节的方式*/
public class Practice_Demo6 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("E:\\a.png");
        FileOutputStream fos=new FileOutputStream("D:\\a.png");
        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
