package ClassParactice03;

import java.io.*;

/*#### 案例需求
复制多级文件夹【应用】
- 把“E:\\itcast”这个文件夹复制到模块目录下*/
public class CopyFolder_demo1 {
    public static void main(String[] args) throws IOException{
        File srcFolder=new File("C:\\software\\itcast1");
        String folderName = srcFolder.getName();
        
        File destFolder=new File("Class_CharStream",folderName);
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        File[] listFiles = srcFolder.listFiles();
        for (File srcFile : listFiles) {
            String srcFileName = srcFile.getName();
            File destFile=new File(destFolder,srcFileName);
            copyFile(srcFile,destFile);
        }
    }

    private static void copyFile(File srcFile, File destFile)throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys=new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
