import java.util.ArrayList;
import java.util.Scanner;

/*创建一个存储学生对象的集合，存储3个学生对象，
学生对象的数据来自键盘录入，（调用方法实现添加学生对象）
使用程序在控制台遍历该集合*/
public class ArrayList_Demo2 {
    public static void main(String[] args) {
//        创建学生集合对象
        ArrayList<Student> array = new ArrayList<Student>();
//        调用方法添加学生对象
        addStudent(array);
        addStudent(array);
        addStudent(array);
//        遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge() + "," + s.getSex());
        }

    }

    //    构造方法：往集合中添加学生对象
    /*返回值类型：void （由于集合是引用类型数据，形参改变，成员变量值也改变）
      参数：集合ArrayList<Student> array
     */
    public static void addStudent(ArrayList<Student> array) {
//        创建学生对象
        Student s = new Student();
//        键盘录入属性值并通过set方法赋值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生性别：");
        Scanner sc1=new Scanner(System.in);
        String sex = sc1.nextLine();
        s.setName(name);
        s.setAge(age);
        s.setSex(sex);
//        往集合中添加学生对象
        array.add(s);
    }


}
