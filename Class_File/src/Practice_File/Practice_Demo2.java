package Practice_File;

import java.io.File;
import java.io.IOException;

/*【代码题】
描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件*/
public class Practice_Demo2 {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\software\\a.txt");
        if (f1.exists()){
            System.out.println(f1.exists());

        }else {
            f1.createNewFile();
        }
        System.out.println(f1.getPath());
    }
}
