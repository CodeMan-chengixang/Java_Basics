package Practice_File;

import java.io.File;

/*【代码题】
描述:创建两个文件对象，分别使用相对路径和绝对路径创建*/
public class Practice_Demo1 {
    public static void main(String[] args) {
        File f1=new File("C\\software\\itcat\\练习测试.txt");
        File f2=new File("练习测试.txt");
        System.out.println(f1);
        System.out.println(f2);
    }
}
