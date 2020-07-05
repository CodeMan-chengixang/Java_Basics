package Class_Fille_Demo1;

import java.io.File;

/*方法名说明
File(String   pathname)通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
File(String   parent, String child)从父路径名字符串和子路径名字符串创建新的File实例
File(File   parent, String child)从父抽象路径名和子路径名字符串创建新的File实例*/
public class File_Demo1 {
    public static void main(String[] args) {
        //File(String   pathname)
        File f1=new File("C:\\software\\itcast\\java.txt");
        System.out.println(f1);//C:\software\itcast\java.txt
        // f1仅仅是抽象路径的表示形式，文件并不存在。file类重写了toString（）方法

        //File(String   parent, String child)
        File f2=new File("C:\\software\\itcast","java.txt");
        System.out.println(f2);//C:\software\itcast\java.txt

        //File(File   parent, String child)
        File f0=new File("C:\\software\\cast");
        File f3=new File(f0,"java.txt");
        System.out.println(f3);//C:\software\cast\java.txt

        //3个构造方法做了同一件事情
    }
}
