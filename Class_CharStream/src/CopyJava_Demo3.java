import java.io.*;

/*
案例需求
 把模块目录下的“ConversionStreamDemo.java”
 复制到模块目录下的“Copy.java”(使用字符缓冲流)
 */
public class CopyJava_Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader
                (new FileReader("class_charstream\\ConversionStream_Demo.java"));
        BufferedWriter bw=new BufferedWriter
                (new FileWriter("class_charstream\\Copy.java"));
        //一次读取一个字符
//        int ch;
//        while ((ch=br.read())!=-1){
//            bw.write(ch);
//        }

        //一次读取一个字符数组
        char[] chs=new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        br.close();
        bw.close();
    }
}
