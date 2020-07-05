package ClassParactice03;

import java.io.*;

public class CopyFolder_Demo3 {
    public static void main(String[] args) {
        File srcFolder = new File("C:\\software\\itcast2");
        File destFolder = new File("C:\\Test_Demo\\");
        copyFolder(srcFolder, destFolder);

    }

    private static void copyFolder(File srcFolder, File destFolder) {
        if (srcFolder.isDirectory()) {
            File newFolder = new File(destFolder, srcFolder.getName());
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            File[] files = srcFolder.listFiles();
            for (File file : files) {
                copyFolder(file, newFolder);
            }
        } else {
            File newFile = new File(destFolder, srcFolder.getName());
            copyFile_Method3(srcFolder, newFile);
        }
    }

    //处理异常方案一：用throws IOException直接抛出，将来谁调用谁处理
    public static void copyFile_Method1(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream
                (new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream
                (new FileOutputStream(destFile));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }

    //处理异常方案二：用try...catch...finaly...处理，（比较麻烦）
    public static void copyFile_Method2(File srcFile, File destFile) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream
                    (new FileInputStream(srcFile));
            bos = new BufferedOutputStream
                    (new FileOutputStream(destFile));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //处理异常方案三：JDK7提供的改进方案try...catch...处理(优选)
    //在try（定义流对象）{...}catch{...}，可以自动释放资源
    public static void copyFile_Method3(File srcFile, File destFile) {
        try (BufferedInputStream bis = new BufferedInputStream
                (new FileInputStream(srcFile));
             BufferedOutputStream bos = new BufferedOutputStream
                     (new FileOutputStream(destFile)))
        {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //处理异常方案四：JDK9提供的改进方案try...catch...处理(还是麻烦一点)
    //先定义流对象；再try（流对象）{...}catch{...}，也可以自动释放资源
    //但定义后还在要用throws IOException抛出异常
    public static void copyFile_Method4(File srcFile, File destFile)throws IOException {
        BufferedInputStream bis = new BufferedInputStream
                (new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream
                (new FileOutputStream(destFile));
        try (bis;bos) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
