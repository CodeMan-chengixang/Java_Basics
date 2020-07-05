package Practice_File;

import java.io.File;

/*【代码题】
将D盘下a.txt文件删除
将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。*/
public class Practice_Demo5 {
    public static void main(String[] args) {
        File f1=new File("C:\\software\\a.txt");
        System.out.println(f1.delete());

        File f2=new File("C:\\software\\ccc\\bbb\\aaa");
        System.out.println(f2.delete());
    }
}
