package Class_Byte_InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
案例：复制图片
需求：把"C:\\software\\测试图片.jpg"复制到模块下的"Class_ByteStream\\图片.jpg"
 */
public class Byte_InputStream_Demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\software\\测试图片.jpg");
        FileOutputStream fos = new FileOutputStream("Class_ByteStream\\图片.jpg");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fis.close();
        fos.close();
    }
}
