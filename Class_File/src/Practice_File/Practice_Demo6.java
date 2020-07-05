package Practice_File;

import java.io.File;
import java.io.IOException;

/*【代码题】
获取D盘aaa文件夹中b.txt文件的文件名，
文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
答案:
操作步骤:
1.    在D盘aaa文件夹中创建一个b.txt文件并输入数据
2.    创建文件对象关联路径：d:/aaa/b.txt
3.    调用文件对象的相关方法获得信息并输出。
可以通过API帮助文档查询方法*/
public class Practice_Demo6 {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\software\\aaa");
        f1.mkdirs();
        File f2=new File(f1,"\\b.txt");
        f2.createNewFile();
        System.out.println(f2.getName());
        System.out.println(f2.length());
        System.out.println(f2.getAbsolutePath());
        String parent = f2.getParent();
        System.out.println(parent);
        File parentFile = f2.getParentFile();
        System.out.println(parentFile);
    }

}
