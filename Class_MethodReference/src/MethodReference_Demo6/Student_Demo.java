package MethodReference_Demo6;

/*### 引用构造器【应用】
​	引用构造器，其实就是引用构造方法
- l格式
  类名::new
- 范例
  Student::new
- 练习描述
  - 定义一个类(Student)，里面有两个成员变量(name,age)
    并提供无参构造方法和带参构造方法，以及成员变量对应的get和set方法
  - 定义一个接口(StudentBuilder)，里面定义一个抽象方法
    Student build(String name,int age);
  - 定义一个测试类(StudentDemo)，在测试类中提供两个方法
    - 一个方法是：useStudentBuilder(StudentBuilder s)
    - 一个方法是主方法，在主方法中调用useStudentBuilder方法*/
public class Student_Demo {
    public static void main(String[] args) {
        //Lambda表达式方法
        useStudentBuilder(((id, name, age) -> new Student(id,name,age)));

        //引用构造器（也就是引用构造方法）
        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("java001", "刘德华", 30);
        System.out.println(s.getId() + "," + s.getName() + "," + s.getAge());
    }
}
