import java.io.*;

/*
案例需求
 把模块目录下的“ConversionStreamDemo.java”
 复制到模块目录下的“Copy.java”(使用字符缓冲流特有功能)
 */
public class CopyJava_Demo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader
                (new FileReader("class_charstream\\conversionStream_Demo.java"));
        BufferedWriter bw=new BufferedWriter
                (new FileWriter("class_charstream\\Copy.java"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
