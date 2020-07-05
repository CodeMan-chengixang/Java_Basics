package ClassPractice_CatAndDog;

public class Animal_Demo {
    public static void main(String[] args) {
        Animal a = new Cat("加菲猫",5);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();

        a=new Dog("柯基",2);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();
    }
}
