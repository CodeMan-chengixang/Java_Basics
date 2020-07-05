package Reflect_Demo;

public class Reflect_Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);//class Reflect_Demo.Student
        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);//true

        //调用对象的getClass()方法，返回该对象所属类对应的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1==c3);//true

        //使用Class类中的静态方法forName(String className)
        Class<?> c4 = Class.forName("Reflect_Demo.Student");
        System.out.println(c1==c4);
    }
}
