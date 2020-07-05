import java.io.*;

/*
InputStreamReader(InputStream in)使用默认字符编码创建InputStreamReader对象
InputStreamReader(InputStream in,String chatset)使用指定的字符编码创建InputStreamReader对象
OutputStreamWriter(OutputStream out)使用默认字符编码创建OutputStreamWriter对象
OutputStreamWriter(OutputStream out,String charset)使用指定的字符编码创建OutputStreamWriter对象
*/
public class ConversionStream_Demo {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter(OutputStream out)
        /*OutputStreamWriter osw=new OutputStreamWriter
                (new FileOutputStream
                ("Class_CharStream\\osw.txt"));//中国*/

        //OutputStreamWriter(OutputStream out,String charset)
        /*OutputStreamWriter osw=new OutputStreamWriter
                (new FileOutputStream
                        ("Class_CharStream\\osw.txt"),
                        "UTF-8");//中国*/
        OutputStreamWriter osw=new OutputStreamWriter
                (new FileOutputStream
                        ("Class_CharStream\\osw.txt"),
                        "GBK");//�й�

        osw.write("中国");
        osw.close();

        //InputStreamReader(InputStream in)
        /*InputStreamReader isr=new InputStreamReader
                (new FileInputStream
                        ("Class_CharStream\\osw.txt"));//�й�
                        */

        InputStreamReader isr=new InputStreamReader
                (new FileInputStream
                        ("Class_CharStream\\osw.txt"),
                        "GBK");//中国
      /*  //一次读取一个字符数据//�й�
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }*/
        //一次读取一个字符数组数据//�й�
        char[] chars=new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        isr.close();
    }
}
