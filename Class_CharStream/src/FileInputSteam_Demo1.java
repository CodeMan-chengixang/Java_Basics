import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
需求：字节流读文本文件数据
一个汉字存储：
             如果是GBK编码，占用2个字节
             如果是UTF-8编码，占用3个字节
*/
public class FileInputSteam_Demo1 {
    public static void main(String[] args) throws IOException {
/*        FileInputStream fis = new FileInputStream("Class_CharStream\\fis.txt");
       int by;
        while ((by=fis.read())!=-1){
            System.out.print((char) by);//abcä¸­å½
        }
        fis.close();*/

 /*     byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
*/

       /* FileOutputStream fos = new FileOutputStream("Class_CharStream\\fis.txt");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();*/

        FileOutputStream fos = new FileOutputStream("Class_CharStream\\demo.txt");

        fos.write("abc".getBytes());

        fos.close();
    }
}
