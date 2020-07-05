package ClassParactice03;

import java.io.*;

/*复制多级文件夹【应用】
#### 1.3.1案例需求
- 把“E:\\itcast”这个文件夹复制到 F盘目录下
步骤：
     1、创建数据源file对象srcFolder，并获取文件对象名称
     2、创建目的地file对象destFolder，目的路径+文件名称
     3、通过方法实现复制：参数为数据源文件对象和目的地文件对象
         3.1判断srcFolder是否为目录
            A：是：
                 （1）在目的地文件下创建和数据源文件名称相同的文件目录
                 （2）获取该数据源目录下所有目录或者文件的file数组
                 （3）遍历数组，得到每一个file对象
                 （4）把得到的file对象作为数据源对象，递归调用复制文件的方法
            B：否
                 不是，说明是文件，直接复制，用字节流
*/
public class CopyFolder_Demo2 {
    public static void main(String[] args)throws IOException {
        File srcFolder=new File("C:\\software\\itcast2");

        File destFolder=new File("C:\\Test_Demo");
        copyFoler(srcFolder,destFolder);
    }

    private static void copyFoler(File srcFolder, File destFolder)throws IOException {
        if(srcFolder.isDirectory()){
            File destFile=new File(destFolder,srcFolder.getName());//C:\Test_Demo\itcast2
            if (!destFile.exists()){
                destFile.mkdir();
            }
            File[] listFiles = srcFolder.listFiles();
            for (File file : listFiles) {
                copyFoler(file,destFile);
            }
        }else {
            File newFile=new File(destFolder,srcFolder.getName());
            copyFile(srcFolder,newFile);
        }
    }

    private static void copyFile(File srcFolder, File destFolder) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFolder));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFolder));
        byte[] bys=new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
