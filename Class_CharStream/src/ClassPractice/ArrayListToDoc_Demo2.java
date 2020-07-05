package ClassPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*案例需求
把ArrayList集合中的学生数据写入到文本文件。
要求：每一个学生对象的数据作为文件中的一行数据
​        格式：学号,姓名,年龄,居住地
	举例：itheima001,林青霞,30,西安*/
public class ArrayListToDoc_Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter
                (new FileWriter("Class_CharStream\\Students.doc"));
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("java001", "王昭君", 18, "宋朝"));
        arr.add(new Student("java002", "西施", 22, "南北朝"));
        arr.add(new Student("java003", "貂蝉", 23, "三国时期"));
        arr.add(new Student("java004", "杨玉环", 19, "唐朝"));

        for (Student s : arr) {
            bw.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
