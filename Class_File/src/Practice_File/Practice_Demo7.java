package Practice_File;

import java.io.File;

/*【代码题】
描述:
获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
注意：不包含子文件夹下的文件
答案
操作步骤:
1.    创建文件对象关联到指定文件夹，比如：c:/aaa
2.    调用文件对象的listFiles方法获得文件数组
3.    遍历文件数组将每一个文件的名字输出到控制台*/
public class Practice_Demo7 {
    public static void main(String[] args) {
        File f1 = new File("C:\\software");
        File[] files = f1.listFiles();
        for (File file : files) {
            String name = file.getName();
            System.out.println(name);
        }
    }
}
