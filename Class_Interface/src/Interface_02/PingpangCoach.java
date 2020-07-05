package Interface_02;

/*乒乓球教练*/
public class PingpangCoach extends Coach implements LearanEenglish {
    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    public PingpangCoach() {
    }

    @Override
    public void show() {
        System.out.println("我是乒乓球教练");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球技术");
    }

    @Override
    public void learningEnglish() {
        System.out.println("乒乓球教练学英语");
    }
}
