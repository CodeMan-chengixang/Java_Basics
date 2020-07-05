package ClassPractice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*案例需求
把ArrayList集合中的字符串数据写入到文本文件。
要求：每一个字符串元素作为文件中的一行数据*/
public class ArrayListToTxt_Demo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array=new ArrayList<>();
        array.add("hello");
        array.add("刘德华");
        array.add("20190909");
        array.add("nihao 你好");

        FileWriter fw=new FileWriter("class_Charstream\\ArrayListToTxt.txt");
        for (String s : array) {
            fw.write(s);
            fw.write(System.lineSeparator());
            fw.flush();
        }
        fw.close();
    }
}
