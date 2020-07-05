package Class_Set_TreeSet03;

import java.util.Comparator;
import java.util.TreeSet;

/*比较器Comparator的使用
 * 存储学生对象并遍历，创建TreeSet集合对象使用带参构造方法
 * 要求：按照年龄大小顺序排序，年龄相同时，按照姓名的字母顺序排序*/
public class Class_TreeSet_Comparator {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            //通过匿名内部类的方式实现了Comparator接口的子类匿名对象
            @Override
            public int compare(Student o1, Student o2) {
                int i1 = o1.getAge() - o2.getAge();
                int i2 = (i1 == 0 ? o1.getName().compareTo(o2.getName()) : i1);
                return i2;
            }
        });

        Student s1 = new Student("yewen", 34, "广东");
        Student s2 = new Student("huangfeihong", 27, "佛山");
        Student s3 = new Student("lixiaolong", 25, "北京");
        Student s4 = new Student("chenglong", 18, "香港");
        Student s5 = new Student("lilianjie", 27, "福建");
        Student s6 = new Student("yewen", 34, "广东");


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);//重复的对象，不会添加

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }
}
