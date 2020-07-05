package Class_Byte_BufferStream;

import java.io.*;

/*
### 字节缓冲流构造方法【应用】
- 字节缓冲流介绍
  - lBufferOutputStream：该类实现缓冲输出流。通过设置这样的输出流，
应用程序可以向底层输出流写入字节，而不必为写入的每个字节导致底层系统的调用
  - lBufferedInputStream：创建BufferedInputStream将创建一个内部缓冲区数组。
当从流中读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次很多字节
- 构造方法：
  | 方法名                                 | 说明                   |
  | -------------------------------------- | ---------------------- |
  | BufferedOutputStream(OutputStream out) | 创建字节缓冲输出流对象 |
  | BufferedInputStream(InputStream in)    | 创建字节缓冲输入流对象 |
*/
public class BufferStreamDemo1 {
    public static void main(String[] args)throws IOException {
/*
//BufferedOutputStream(OutputStream out) | 创建字节缓冲输出流对象 |
//        FileOutputStream fos=new FileOutputStream("Class_ByteStream\\fos4.txt");
//        BufferedOutputStream bos=new BufferedOutputStream(fos);
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("Class_ByteStream\\bos1.txt"));

        //写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.write("java\r\n".getBytes());

        //释放资源
        bos.close();
*/
//BufferedInputStream(InputStream in)    | 创建字节缓冲输入流对象 |
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Class_ByteStream\\bos1.txt"));
        /*
        //一次读取一个字节数据
        int by;
        while ((by=bis.read())!=-1){
            System.out.print((char)by);
        }
        */

        //一次读取一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
        }
        //释放资源
        bis.close();
    }

}
