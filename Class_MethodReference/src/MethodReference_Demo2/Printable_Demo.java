package MethodReference_Demo2;

public class Printable_Demo {
    public static void main(String[] args) {
        usePrintable(System.out::println);

        usePrintable(i -> System.out.println(i));

    }
    private static void usePrintable(Printable p){
        p.printInt(888);
    }
}
