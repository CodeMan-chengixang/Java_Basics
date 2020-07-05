package Collection03_Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*创建存储学生对象的集合，存储3个学生对象，
 * 使用程序实现在控制台遍历该集合*/
public class Collection_Student_Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("黄飞鸿");
        s1.setAge(18);
        s1.setAddress("广东");

        Student s2 = new Student("叶问", 23, "佛山");
        Student s3 = new Student("李小龙", 33, "北京");

        Collection<Student> c = new ArrayList<Student>();
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge() + "岁,来自" + s.getAddress());
        }
        Collection<String> coll = new ArrayList<>();

        coll.add("西施");

        coll.add("貂蝉");

        for (String s:coll) {

            System.out.println(s);

        }
    }

}
