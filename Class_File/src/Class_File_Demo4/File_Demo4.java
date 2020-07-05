package Class_File_Demo4;

import java.awt.font.FontRenderContext;
import java.io.File;
import java.io.IOException;

/*### File类判断和获取功能【应用】
- 判断功能
  | 方法名                         | 说明                                 |
  | ------------------------------ | ------------------------------------ |
  | public   boolean isDirectory() | 测试此抽象路径名表示的File是否为目录 |
  | public   boolean isFile()      | 测试此抽象路径名表示的File是否为文件 |
  | public   boolean   exists()    | 测试此抽象路径名表示的File是否存在   |
- 获取功能
  | 方法名                            | 说明                                                     |
  | --------------------------------- | -------------------------------------------------------- |
  | public   String getAbsolutePath() | 返回此抽象路径名的绝对路径名字符串                       |
  | public   String getPath()         | 将此抽象路径名转换为路径名字符串                         |
  | public   String getName()         | 返回由此抽象路径名表示的文件或目录的名称                 |
  | public   String[] list()          | 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组 |
  | public   File[] listFiles()       | 返回此抽象路径名表示的目录中的文件和目录的File对象数组   |*/
public class File_Demo4 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Class_File\\功能测试.txt");
        f1.createNewFile();
        new File("Class_File\\\\功能测试").delete();

        System.out.println(f1.isAbsolute());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        File f2 = new File("C:\\software\\itcast");
        System.out.println(f2.getAbsoluteFile());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getName());
        System.out.println("--------");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getName());
        System.out.println("--------");
        String[] listf2 = f2.list();
        for (String s : listf2) {
            System.out.println(s);
        }
        System.out.println("--------");
        File[] files = f2.listFiles();
        for (File file : files) {
            System.out.println(file.getPath());
        }


    }
}
