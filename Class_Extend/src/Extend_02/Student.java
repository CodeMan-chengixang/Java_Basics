package Extend_02;

/*学生类——子类*/
public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void study() {
        System.out.println("好好学习，天天向上");
    }
}
