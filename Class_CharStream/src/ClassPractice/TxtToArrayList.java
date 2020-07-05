package ClassPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*案例需求
把文本文件中的数据读取到集合中，并遍历集合。
要求：文件中每一行数据是一个集合元素*/
public class TxtToArrayList {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader
                (new FileReader("class_Charstream\\ArrayListToTxt.txt"));
        ArrayList<String> array=new ArrayList<>();

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();

        for (String s : array) {
            System.out.println(s);
        }
    }
}
