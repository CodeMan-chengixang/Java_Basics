package Class_Byte_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*FileOutStream（）文件输出流，用于将数据写入file
 * 构造方法FileOutStream（String name）：创建文件输出流，以指定的名称写入文件
 * String name为指定文件的路径和名称*/
public class ByteStream_Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Class_ByteStream\\fos.txt");
        /*
          创建字节输出流对象做了3件事情：
           1、调用系统功能创建了文件fos.txt
           2、创建了字节输出流对象
           3、让字节输出流对象指向了创建好的文件
         */

        //void write​(int b) :将指定的字节写入此文件输出流。
        fos.write(97);//显示字符a
        // 底层写入的是97，但是用txt文件打开进行了转换
        fos.write(57);//字符9
        fos.write(55);//字符7

        //所有和IO操作相关的内容，最后都要释放资源
        //void close​() 关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos.close();//很重要

        /*使用字节输出流写数据的三个步骤
        1、创建字节输出流对象
        （调用系统功能创建文件；创建字节输出流对象；让字节输出流对象指向了该文件）
        2、调用字节输出流的写数据方法写数据（write（）方法）
        3、释放资源
        （调用字节输出流的close（）方法，关闭此文件输出流并释放与此流相关的任何系统资源）
        */

    }
}
