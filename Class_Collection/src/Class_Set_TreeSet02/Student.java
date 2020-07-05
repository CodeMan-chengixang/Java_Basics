package Class_Set_TreeSet02;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Student o) {
        // return 0;表示是重复的元素，add（）不添加
        // return 负数;表示自然顺序为降序
//        return -66;
        // return 正数;表示自然顺序为升序
//也就是说：以后想要升序，this放在运算前面，
//              想要降序，this放在运算后面

//        按照年龄从大到小排列
        int i1 = this.age - o.age;
//        当年龄相同时，按姓名的字母顺序排列（String类中重写了comparaTo（）方法）
        int i2 = (i1 == 0 ? this.name.compareTo(o.getName()) : i1);

        return i2;
    }
}
