package Practice_Demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Practice_Demo2 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        array.add(new Student("zhangsan", 19));
        array.add(new Student("lisi", 32));
        array.add(new Student("wangjianlin", 18));
        array.add(new Student("mahuateng", 22));
        array.add(new Student("mayun", 18));
        array.add(new Student("alibaba", 32));

        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num1 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num1;
            }
        });

        for (Student s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
