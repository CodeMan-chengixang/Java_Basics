public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        int num1=this.age-o.age;
        int num2 = num1 == 0 ? this.name.compareTo(o.getName()) : num1;
        return num2;
    }
}
