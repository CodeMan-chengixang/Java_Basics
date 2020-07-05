package Extend_02;

/*老师类——子类*/
public class Teacher extends Person {
    public Teacher(String name, int age, String sex) {
/*
        this.name=name;
        this.age=age;
        this.sex=sex;
//        会报错，因为name、age、sex是Person的私有的变量，
//        要用super关键字访问父类的成员变量
*/
        super(name, age, sex);
    }

//    提供了带参构造方法，系统就不再提供默认的无参构造方法，
//    需要手动提供无参构造方法
    public Teacher() {
    }

    public void teach() {
        System.out.println("用爱成就每一位学生");
    }
}
