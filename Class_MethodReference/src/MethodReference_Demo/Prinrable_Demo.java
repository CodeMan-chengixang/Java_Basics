package MethodReference_Demo;

public class Prinrable_Demo {
    public static void main(String[] args) {

        usePrintable(s -> System.out.println(s));

        usePrintable(System.out::println);

    }

    private static void usePrintable(Printable p) {
        p.printString("helloworld");
    }
}
