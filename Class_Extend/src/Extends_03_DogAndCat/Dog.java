package Extends_03_DogAndCat;
/*狗类——子类*/
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String age) {
        super(name, age);
    }

    public static void lookHome(){
        System.out.println("狗看家");
    }
}
