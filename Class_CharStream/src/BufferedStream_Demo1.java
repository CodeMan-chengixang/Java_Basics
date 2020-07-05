import java.io.*;

/*
BufferedWriter(Writer out)创建字符缓冲输出流对象
BufferedReader(Reader in)创建字符缓冲输入流对象
*/
public class BufferedStream_Demo1 {
    public static void main(String[] args)throws IOException {
//        BufferedWriter bw=new BufferedWriter
//                (new FileWriter("class_charstream\\bw.txt"));
//        bw.write("hello\r\n");
//        bw.write("world\r\n");
//        bw.close();

        BufferedReader br=new BufferedReader
                (new FileReader("class_charstream\\bw.txt"));
        //一次读一个字符
        /*int ch;
        while ((ch=br.read())!=-1){
            System.out.print((char)ch);
        }*/

        //一次读一个字符数组
        char[] chs=new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }


        br.close();
    }
}
