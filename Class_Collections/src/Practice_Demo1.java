import java.util.ArrayList;
import java.util.Collections;

/*案例：ArrayList集合存储学生对象并排序
 * 需求：ArrayList存储学生对象，使用Collections岁ArrayList集合进行排序
 * 要求按照年龄的从小到大顺序，年龄相同时，按照姓名的字母顺序排序*/
public class Practice_Demo1 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student("zhangsan", 18));
        array.add(new Student("lisi", 20));
        array.add(new Student("wangwu", 21));
        array.add(new Student("alibaba", 18));
        Collections.sort(array);
        for (Student s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
