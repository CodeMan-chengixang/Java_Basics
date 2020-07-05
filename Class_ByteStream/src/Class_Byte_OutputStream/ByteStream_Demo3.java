package Class_Byte_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
字节流写数据的两个小问题
1、字节流写数据如何实现换行？
   只需在写数据的时候写入换行符号就可以
   不同的操作系统可以识别的换行符号不一样如：
      Windows：\r\n
      Linux:\n
      Mac:\r
      而IDEA是可以识别多种换行符的，
      要使用不同系统自带的记事本软件打开文件，就要使用对应的换行符
2、字节流写数据如何实现追加写入呢？
   创建对象时使用构造方法：
   public FileOutputStream​(String name,boolean append)创建文件输出流以指定的名称写入文件。
   如果第二个参数append为true ，则字节将写入文件的末尾而不是开头。

*/
public class ByteStream_Demo3 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos=new FileOutputStream("Class_ByteStream\\fos3.txt");
        FileOutputStream fos=new FileOutputStream
                ("Class_ByteStream\\fos3.txt",true);
                 //true表示的就是追加写入，字节将写入文件的末尾
        for (int i=0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        //追加写入后，写入了20个hello，而不是10个
        fos.close();
    }
}
