package Class_Set_HashSet02;

import java.util.HashSet;
/*HashSet集合存储学生对象并遍历
* 创建一个存储学生对象的集合，存储多个学生对象，用程序实现在控制台遍历该集合
* 要求：学生对象的成员变量值相同，我们就认为是同一个对象
* (即在学生类中重写equals()和hashCode()方法（自动生成即可）)
* */
public class Class_HashSet_Demo2 {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<>();
        Student s1=new Student("java001","黄飞鸿",22);
        Student s2=new Student("java002","叶问",34);
        Student s3=new Student("java003","李小龙",12);
        Student s4=new Student("java004","成龙",25);
        Student s5=new Student("java001","黄飞鸿",22);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);

        for (Student s:hs){
            System.out.println(s.getId()+","+s.getName()+","+s.getAge());
        }



    }
}
