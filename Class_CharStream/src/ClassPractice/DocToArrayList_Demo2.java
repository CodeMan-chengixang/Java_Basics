package ClassPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*案例需求
把文本文件中的数据读取到集合中，并遍历集合。
要求：文件中每一行数据是一个学生对象的成员变量值
 举例：itheima001,林青霞,30,西安*/
public class DocToArrayList_Demo2 {
    public static void main(String[] args)throws IOException {
        ArrayList<Student> arr=new ArrayList<>();
        BufferedReader br= new BufferedReader
                (new FileReader("class_CharStream\\Students.doc"));
        String line;
        while ((line=br.readLine())!=null){
            String[] split = line.split(",");
            Student s = new Student();
            s.setId(split[0]);
            s.setName(split[1]);
            s.setAge(Integer.parseInt(split[2]));
            s.setAddress(split[3]);
            arr.add(s);
        }
        br.close();

        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
