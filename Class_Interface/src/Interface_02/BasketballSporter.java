package Interface_02;

/*篮球运动员类*/
public class BasketballSporter extends Athletes {
    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    public BasketballSporter() {
    }

    @Override
    public void show() {
        System.out.println("我是篮球运动员");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员练习篮球");
    }
}
