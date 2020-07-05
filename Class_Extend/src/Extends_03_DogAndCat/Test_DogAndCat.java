package Extends_03_DogAndCat;

public class Test_DogAndCat {
    public static void main(String[] args) {
        Cat c1 = new Cat("加菲猫", "3");
        System.out.println(c1.getName() + "," + c1.getAge() + "岁");
        c1.catchMouse();

        Cat c2 = new Cat();
        c2.setName("波斯猫");
        c2.setAge("2");
        System.out.println(c2.getName() + "," + c2.getAge() + "岁");
        c2.catchMouse();

        Dog d1 = new Dog("拉布拉多", "5");
        System.out.println(d1.getName() + "," + d1.getAge() + "岁");
        d1.lookHome();

        Dog d2 = new Dog("柯基", "1");
        System.out.println(d2.getName() + "," + d2.getAge() + "岁");
        d2.lookHome();


    }
}
