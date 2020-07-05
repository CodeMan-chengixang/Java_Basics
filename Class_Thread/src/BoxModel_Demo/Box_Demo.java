package BoxModel_Demo;

public class Box_Demo {
    public static void main(String[] args) {
        Box b=new Box();

        Producer p=new Producer(b);
        Customer c=new Customer(b);

        Thread tp=new Thread(p);
        Thread tc=new Thread(c);

        tp.start();
        tc.start();
    }
}
