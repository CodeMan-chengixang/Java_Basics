package Class_Byte_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
构造方法：
FileOutputStream​(String name) 创建文件输出流以指定的名称写入文件。
FileOutputStream​(File file) 创建文件输出流以写入由指定的 File对象表示的文件。

写数据的三种方式：
void write​(int b)： （一个一个字节写数据）
          将指定的字节写入此文件输出流。
void write​(byte[] b) :（一次写一个字节数组的数据）
          将 b.length字节从指定的字节数组写入此文件输出流。
void write​(byte[] b, int off, int len) ：（一次写一个字节数组的部分数据）
          将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流。
*/
public class ByteStream_Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("Class_ByteStream\\fos2.txt");
        //等同于FileOutputStream fos=new FileOutputStream(new File（"Class_ByteStream\\fos2.txt"）);
        //相当于自动封装了一个new File（name）

//        File f=new File("Class_ByteStream\\fos2.txt");
//        FileOutputStream fos2=new FileOutputStream(f);

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);//abcde

//        byte[] bytes={97,98,99,100,101};
//        fos.write(bytes);//abcde

//        byte[] bytes1 = "abcde".getBytes();//String类的getBytes（）方法
//        fos.write(bytes1);//abcde

        byte[] bytes2 = "abcdefgh".getBytes();
        fos.write(bytes2,3,3);//def

        fos.close();//别忘记释放资源

    }
}
