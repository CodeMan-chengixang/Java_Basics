package ClassPractice_CatAndDod;

/*测试类*/
public class Animal_Demo {
    public static void main(String[] args) {
//        多态的形式创建对象
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge() + "岁");
        a.eat();
        ((Cat) a).playGame();

        a = new Cat("英国短猫", 2);
        System.out.println(a.getName() + "," + a.getAge() + "岁");
        a.eat();
        ((Cat) a).playGame();

        a = new Dog("柯基", 3);
        System.out.println(a.getName() + "," + a.getAge() + "岁");
        a.eat();
        ((Dog) a).lookDoor();
    }
}
