package Interface_02;

/*篮球教练类*/
public class BasketballCoach extends Coach {
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void show() {
        System.out.println("我是篮球教练");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球技术");
    }
}
