package Class_File_Demo2;

import java.io.File;
import java.io.IOException;

/*| 方法名                         | 说明                                                         |
| ------------------------------ | ------------------------------------------------------------ |
| public boolean createNewFile() | 当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件 |
| public boolean mkdir()         | 创建由此抽象路径名命名的目录                                 |
| public boolean mkdirs()        | 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录   |*/
public class File_Demo2 {
    public static void main(String[] args) throws IOException {
        //public boolean createNewFile()
        //如果文件不存在，就创建文件，返回true
        //如果文件存在，就不创建文件，返回false
        File f1=new File("C:\\software\\itcast\\java.txt");
        System.out.println(f1.createNewFile());//true
        //再执行一次，返回false；

        //| public boolean mkdir()
        //如果目录不存在，就创建目录，返回true
        //如果目录存在，就不创建目录，返回false
        File f2=new File("C:\\software\\itcast\\javaEE");
        System.out.println(f2.mkdir());

        //public boolean mkdirs()
        //如果目录不存在，就创建目录，返回true
        //如果目录存在，就不创建目录，返回false
        File f3=new File("C:\\software\\itcast\\javaWeb\\html");
        System.out.println(f3.mkdirs());

        //在C盘的C\\software\\itcast目录下创建一个文件javaSE.txt
        File f4=new File("C:\\software\\itcast\\javaSE.txt");
//        System.out.println(f4.mkdir());//true
        //方法调用错了，也返回了true。
        // 说明不能根据文件路径名来判断是文件还是目录，应该根据调用的方法来判断是文件还是目录
        //创建的时候文件和目录的名字都不能重复
        System.out.println(f4.createNewFile());

    }
}
