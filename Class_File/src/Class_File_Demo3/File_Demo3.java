package Class_File_Demo3;

import java.io.File;
import java.io.IOException;

/*### File类删除功能【应用】
        - 方法分类

        | 方法名                    | 说明                               |
        | ------------------------- | ---------------------------------- |
        | public boolean   delete() | 删除由此抽象路径名表示的文件或目录 |*/
public class File_Demo3 {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\software\\itcast\\java删除测试.txt");
        f.createNewFile();
        f.delete();

        File f1=new File("Class_File\\java测试.txt");
        f1.createNewFile();
        f1.delete();
    }
}
