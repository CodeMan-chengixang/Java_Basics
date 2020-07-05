package ProducerAndCustomer_Demo;

public class Box_Demo {
    public static void main(String[] args) {
        Box b=new Box();

        Customer c = new Customer(b);
        Producer p = new Producer(b);

        Thread tc = new Thread(c);
        Thread tp = new Thread(p);

        tc.start();
        tp.start();
    }
}
