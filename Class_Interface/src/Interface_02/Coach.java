package Interface_02;

/*教练类*/
public abstract class Coach extends Person {
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }

    public abstract void teach();

    public void show() {
        System.out.println("我是教练");
    }

    @Override
    public void eat() {
        System.out.println("教练吃牛肉");
    }
}
