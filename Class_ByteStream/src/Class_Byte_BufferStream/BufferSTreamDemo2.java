package Class_Byte_BufferStream;

import java.io.*;

/*
字节流复制视频【应用】
- 案例需求
  把“C:\\software\\五香料包制作.mp4”复制到模块目录下的“测试视频.mp4”
- 实现步骤
  - 根据数据源创建字节输入流对象
  - 根据目的地创建字节输出流对象
  - 读写数据，复制视频
  - 释放资源

  四种方式复制视频，并记录每种方式的复制视频的时间
  1、基本字节流，一次读取一个字节        共耗时59024毫秒
  2、基本字节流，一次读取一个字节数组    共耗时166毫秒
  3、字节缓冲流，一次读取一个字节        共耗时170毫秒
  4、字节缓冲流，一次读取一个字节数组    共耗时65毫秒
*/
public class BufferSTreamDemo2 {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        // 1、基本字节流，一次读取一个字节//共耗时75748毫秒
//        method1();//共耗时59024毫秒

       //2、基本字节流，一次读取一个字节数组
//        method2();//共耗时166毫秒

        //3、字节缓冲流，一次读取一个字节
//        method3();//共耗时170毫秒

        //4、字节缓冲流，一次读取一个字节数组
        method4();//共耗时65毫秒


        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("共耗时" + time + "毫秒");

    }

    public static void method1() throws IOException {
        // 1、基本字节流，一次读取一个字节
        FileOutputStream fos = new FileOutputStream("Class_ByteStream\\测试视频.mp4");
        FileInputStream fis = new FileInputStream("C:\\software\\五香料包制作.mp4");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }

    public static void method2() throws IOException {
        //2、基本字节流，一次读取一个字节数组
        FileOutputStream fos = new FileOutputStream("Class_ByteStream\\测试视频.mp4");
        FileInputStream fis = new FileInputStream("C:\\software\\五香料包制作.mp4");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }

    public static void method3() throws IOException {
        //3、字节缓冲流，一次读取一个字节
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\software\\五香料包制作.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Class_ByteStream\\测试视频.mp4"));
        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    public static void method4() throws IOException {
        //4、字节缓冲流，一次读取一个字节数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\software\\五香料包制作.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Class_ByteStream\\测试视频.mp4"));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }
}
