package CookerAndFoodie;

public class Demo {
    public static void main(String[] args) {
        Desk desk = new Desk();
        Thread tFoodie = new Thread(new Foodie(desk));
        Thread tCooker = new Thread(new Cooker(desk));
        tFoodie.start();
        tCooker.start();
    }
}
