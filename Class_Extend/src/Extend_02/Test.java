package Extend_02;

/*测试类*/
public class Test {
    public static void main(String[] args) {
//        用无参构造方法创建对象，（这个无参构造方法是Teacher类中默认的）
        Teacher t1 = new Teacher();
        t1.setName("马云");
        t1.setAge(55);
        t1.setSex("男");
        System.out.println(t1.getName() + "," + t1.getAge() + "岁," + t1.getSex());
        t1.teach();

        Teacher t2 = new Teacher("马化腾", 77, "男");
//        用带参构造方法创建对象，
//        （会报错，因为Teacher类中没有提供带参构造方法，
//        需要去类中创建一个带参构造方法）
        System.out.println(t2.getName() + "," + t2.getAge() + "岁," + t2.getSex());
        t2.teach();

        Student s1=new Student();
        s1.setName("李小龙");
        s1.setAge(15);
        s1.setSex("男");
        System.out.println(s1.getName() + "," + s1.getAge() + "岁," + s1.getSex());
        s1.study();

        Student s2=new Student("叶问",22,"男");
        System.out.println(s2.getName() + "," + s2.getAge() + "岁," + s2.getSex());
        s2.study();

    }
}
