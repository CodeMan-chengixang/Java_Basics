package Practice_File;

import java.io.File;

/*练习七:文件夹或文件的判断
描述:
1.判断File对象是否是文件,是文件则输出：
xxx是一个文件，否则输出：xxx不是一个文件。
2.判断File对象是否是文件夹,是文件夹则输出：
xxx是一个文件夹，否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)
答案:
操作步骤:
1.	创建两个文件对象分别关联到不同的文件，比如：d:/a.txt，d:/aaa
2.	调用文件对象的判断是否是文件或是否是文件夹的方法
3.	获得文件名，根据判断结果输出信息*/
public class Practice_Demo8 {
    public static void main(String[] args) {
        File f1 = new File("C:\\software");
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName() + "是一个文件");
            } else {
                System.out.println(file.getName() + "不是一个文件");
            }
        }
        System.out.println("-------");
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(file.getName() + "是一个文件夹");
            } else {
                System.out.println(file.getName() + "不是一个文件夹");
            }
        }
    }
}
