package Interface_02;

public class Interface_Demo2 {
    public static void main(String[] args) {
        BasketballSporter bs = new BasketballSporter("易建联", 30);
        System.out.println(bs.getName() + "," + bs.getAge());
        bs.show();
        bs.eat();
        bs.learn();
        System.out.println("----------");

        BasketballCoach bc = new BasketballCoach("姚明", 45);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.show();
        bc.eat();
        bc.teach();
        System.out.println("----------");

        PingpangSporter ps = new PingpangSporter("张怡宁", 20);
        System.out.println(ps.getName() + "," + ps.getAge());
        ps.show();
        ps.eat();
        ps.learn();
        ps.learningEnglish();
        System.out.println("----------");

        PingpangCoach pc = new PingpangCoach("李明", 56);
        System.out.println(pc.getName() + "," + pc.getAge());
        pc.show();
        pc.eat();
        pc.teach();
        pc.learningEnglish();
    }
}
