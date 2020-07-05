package Class_Set_TreeSet04;

import java.util.Comparator;
import java.util.TreeSet;

/*成绩排序
用TreeSet集合存储多个学生信息（姓名、语文成绩、数学成绩）
并遍历该集合，要求：按总分从高到低出现
* */
public class TreeSet_comparator_demo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o2.sumScore() - o1.sumScore();
                int i2 = (i == 0 ? o1.getName().compareTo(o2.getName()) : i);
                return i2;
            }
        });

        Student s1 = new Student("李小龙", 98, 95);
        Student s2 = new Student("黄飞鸿", 95, 98);
        Student s3 = new Student("叶问", 91, 96);
        Student s4 = new Student("成龙", 91, 96);
        Student s5 = new Student("李连杰", 97, 91);
        Student s6 = new Student("李连杰", 99, 99);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getMathScore() + "," + s.getChineseScore() + ",总分是" + s.sumScore());
        }

    }
}
