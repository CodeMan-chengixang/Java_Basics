package Extend_01;

/*测试类*/
public class Test_Studenr_And_Teacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("马云");
        t1.setAge(55);
        t1.setSex("男");
        System.out.println(t1.getName() + "," + t1.getAge() + "岁," + t1.getSex());
        t1.teach();

        Teacher t2 = new Teacher("马化腾", 45, "男");
        System.out.println(t2.getName() + "," + t2.getAge() + "岁," + t2.getSex());
        t2.teach();

        Student s1 = new Student("叶问", 18, "男");
        System.out.println(s1.getName() + "," + s1.getAge() + "岁," + s1.getSex());
        s1.study();

        Student s2 = new Student("黄飞鸿", 19, "男");
        System.out.println(s2.getName() + "," + s2.getAge() + "岁," + s2.getSex());
        s2.study();
    }
}
