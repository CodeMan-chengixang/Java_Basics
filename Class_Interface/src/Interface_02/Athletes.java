package Interface_02;

/*运动员类*/
public abstract class Athletes extends Person {
    public Athletes(String name, int age) {
        super(name, age);
    }

    public Athletes() {
    }

    public void show() {
        System.out.println("我是运动员");
    }

    public abstract void learn();

    @Override
    public void eat() {
        System.out.println("运动员吃鸡肉");
    }
}
