package Class_GeneriClass;

/*泛型类测试类*/
public class GenericDemo {
    public static void main(String[] args) {
        GenericClass<String> g1 = new GenericClass<>();
        g1.setT("刘德华");
        System.out.println(g1.getT());

        GenericClass<Integer> g2 = new GenericClass<>();
        g2.setT(30);
        System.out.println(g2.getT());

        GenericClass<Boolean> g3 = new GenericClass<>();
        g3.setT(false);
        System.out.println(g3.getT());
    }

}
