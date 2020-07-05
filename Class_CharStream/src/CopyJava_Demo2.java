import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*案例需求
把模块目录下的“ConversionStreamDemo.java”
复制到模块目录下的“Copy.java”*/
public class CopyJava_Demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("class_charstream\\conversionStream_demo.java");
        FileWriter fw=new FileWriter("class_charStream\\Copy.java");
        //一次读取一个字符
       /* int ch;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
        }*/
       //一次读取一个字符数组
        char[] chs=new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }

        fr.close();
        fw.close();

    }
}
