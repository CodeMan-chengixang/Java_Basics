package Practice_File;

import java.io.File;
import java.io.IOException;

/*【代码题】
描述:在D盘下创建一个名为bbb的文件夹。*/
public class Practice_Demo3 {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\software\\bbb");
        System.out.println(f.mkdir());

    }
}
