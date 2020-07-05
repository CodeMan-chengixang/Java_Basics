package Class_List01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*用list集合存储学生对象并遍历
 * 创建一个存储学生对象的集合，存储3个学生对象，
 * 使用程序在控制台遍历该集合*/
public class Practice_Demo01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("黄飞鸿", "java001", 22);
        Student s2 = new Student("叶问", "java002", 12);
        Student s3 = new Student("李小龙", "java003", 44);

        list.add(s1);
        list.add(s2);
        list.add(s3);

//用for循环遍历List集合
        for (int i=0;i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName()+","+s.getId()+","+s.getAge());
        }
        System.out.println("--------");

//用迭代器遍历集合
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getId() + "," + s.getAge());
        }
        System.out.println("--------");

//用增强for循环遍历集合
        for (Student s : list) {
            System.out.println(s.getName() + "," + s.getId() + "," + s.getAge());
        }
    }
}
