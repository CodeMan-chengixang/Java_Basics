package Class_Byte_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
案例：复制文本文件
需求：把“C:\\software\\测试文本.doc”文件复制到模块目录下的“测试文本.doc”
**/
public class Byte_InputStream_Demo2 {
    public static void main(String[] args)throws IOException {
        File f=new File("Class_ByteStream");
        new File(f,"测试文本.doc").createNewFile();
        FileInputStream fis=new FileInputStream("C:\\software\\测试文本.doc");
        FileOutputStream fos=new FileOutputStream("Class_ByteStream\\测试文本.doc");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();

    }
}
