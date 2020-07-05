package Class_Byte_InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
字节流读数据(一次读一个字节数据)
- 字节输入流
  - FileInputStream(String name)：
  通过打开与实际文件的连接来创建一个FileInputStream ，该文件由文件系统中的路径名name命名
字节输入流读取数据的步骤
  - 创建字节输入流对象
  - 调用字节输入流对象的读数据方法
  - 释放资源
int read​() 从该输入流读取一个字节的数据。一次读一个数据
*/
public class Byte_IutputStream_Demo1 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("Class_ByteStream\\fis1.txt");

        //调用字节输入流对象的读数据方法

/*
       //第一次读取
        int by1 = fis.read();
        System.out.println(by1);//97
        System.out.println((char) by1);//a
        //第二次读取
        by1 = fis.read();
        System.out.println(by1);//98
        System.out.println((char) by1);//b
        //想用循环改进；再读取，查看循环判断的条件
        // (到达文件末尾，返回值为-1)
        by1 = fis.read();
        System.out.println(by1);//-1
        by1 = fis.read();
        System.out.println(by1);//-1
*/

/*       //循环改进
        int by=fis.read() ;
        while (by!=-1){
            System.out.print((char) by);
            by=fis.read();
        }//ab*/

        //循环优化(while中的判断条件也是可以执行的)
        int by;
        while ((by=fis.read())!=-1){
            System.out.print((char)by);

        }//这3行为字节流读取数据的标准代码


        //释放资源
        fis.close();
    }
}
