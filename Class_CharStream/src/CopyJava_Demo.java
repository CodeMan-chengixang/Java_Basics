import java.io.*;

/*案例需求
把模块目录下的“ConversionStreamDemo.java”
复制到模块目录下的“Copy.java”*/
public class CopyJava_Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader
                (new FileInputStream
                        ("Class_CharStream\\ConversionStream_Demo.java"));
        OutputStreamWriter osw=new OutputStreamWriter
                (new FileOutputStream
                        ("Class_CharStream\\Copy.java"));

       /* //一次读取一个字符数组数据
        char[] chs=new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }*/
        //一次读取一个字符
        int ch;
        while ((ch=isr.read())!=-1){
            osw.write(ch);
        }

        isr.close();
        osw.close();
    }
}
