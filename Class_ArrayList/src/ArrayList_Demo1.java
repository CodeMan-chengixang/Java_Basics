import java.util.ArrayList;

/*创建一个存储学生对象的集合，存储3个学生对象，
使用程序在控制台遍历该集合*/
public class ArrayList_Demo1 {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList<Student> array = new ArrayList<>();
//        创建学生对象
        Student s1 = new Student("张三", 23, "男");
        Student s2 = new Student("李四", 18, "女");
        Student s3 = new Student("王五", 37, "男");
//        添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
//        遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge() + "," + s.getSex());
        }
    }
}
