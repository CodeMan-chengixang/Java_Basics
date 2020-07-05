package Interface_02;

import org.w3c.dom.ls.LSOutput;

/*乒乓球运动员*/
public class PingpangSporter extends Athletes implements LearanEenglish {
    public PingpangSporter(String name, int age) {
        super(name, age);
    }

    public PingpangSporter() {
    }

    @Override
    public void show() {
        System.out.println("我是乒乓球运动员");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员练习乒乓球");
    }

    @Override
    public void learningEnglish() {
        System.out.println("乒乓球运动员学英语");
    }
}
