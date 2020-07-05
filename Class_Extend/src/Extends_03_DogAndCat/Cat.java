package Extends_03_DogAndCat;
/*猫类——子类*/
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String age) {
        super(name, age);
    }

    public static void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
