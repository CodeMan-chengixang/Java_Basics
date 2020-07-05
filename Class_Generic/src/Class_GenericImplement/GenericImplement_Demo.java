package Class_GenericImplement;
/*测试类*/
public class GenericImplement_Demo {
    public static void main(String[] args) {
/*        Generic<String> g1=new Generic<>();
        g1.show("刘德华");
        Generic<Integer> g2=new Generic<>();
        g2.show(30);*/
//调用泛型方法
        Generic<Person> g=new Generic<Person>();

        g.show(new Person());
    }
}
