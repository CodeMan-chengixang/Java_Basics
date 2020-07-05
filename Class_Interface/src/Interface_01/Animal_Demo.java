package Interface_01;

/*动物测试类*/
public class Animal_Demo {
    public static void main(String[] args) {
        Jumpping c1=new Cat();
        c1.jump();
        System.out.println("---------");

        Animal c2=new Cat("加菲猫",4);
        System.out.println(c2.getName()+","+c2.getAge()+"岁");
        c2.eat();
        ((Cat)c2).jump();
        System.out.println("--------");

        Cat c3=new Cat();
        c3.setName("英国短猫");
        c3.setAge(5);
        System.out.println(c3.getName()+","+c3.getAge()+"岁");
        c3.eat();
        c3.jump();
        System.out.println("--------");

        Jumpping d1=new Dog();
        d1.jump();
        System.out.println("---------");

        Animal d2=new Dog("柯基",3);
        System.out.println(d2.getName()+","+d2.getAge()+"岁");
        d2.eat();
        ((Dog) d2).jump();
        System.out.println("-------");

        Dog d3=new Dog("德牧",2);
        System.out.println(d3.getName()+","+d3.getAge()+"岁");
        d3.eat();
        d3.jump();
    }
}
