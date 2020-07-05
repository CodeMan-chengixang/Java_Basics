package Class_ObjectStream;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    transient private int age;
    private static final long serialVersionUID = 42L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }


}
