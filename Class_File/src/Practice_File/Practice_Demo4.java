package Practice_File;

import java.io.File;

/*【代码题】
描述:在D盘下创建一个名为ccc的文件夹，要求如下：
1.ccc文件夹中要求包含bbb子文件夹
2.bbb子文件夹要求包含aaa文件夹*/
public class Practice_Demo4 {
    public static void main(String[] args) {
        File f1=new File("C:\\software\\ccc\\bbb\\aaa");
        System.out.println(f1.mkdirs());
    }
}
