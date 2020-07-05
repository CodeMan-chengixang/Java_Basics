package Class_GenericMethod;
/*泛型类测试类*/
public class GenericDemo {
    public static void main(String[] args) {
//方式一：不用泛型类的方式：
// 将来调用show（）方法，必须提供对应的数据类型的show方法
// 不提供，则会报错
        /* Generic g=new Generic();
            g.show("刘德华");
            g.show(30);
            g.show(false);
//        g.show(13.34);//没有提供double数据类型的调用方法，所以不能调用*/

//方式二：使用泛型类的方式改进：
// 只需提供一个泛型数据类型的show（）方法，任何数据类型都可以调用show（）方法
// 但是每使用哪种数据类型，都要创建一个泛型类对象(用于明确数据类型)，比较麻烦
        /*Generic<String> g1=new Generic<>();
        g1.show("刘德华");
        Generic<Integer> g2=new Generic<>();
        g2.show(30);
        Generic<Boolean> g3=new Generic<>();
        g3.show(true);
        Generic<Double> g4=new Generic<>();
        g4.show(13.145);*/

//方式三：使用泛型方法进一步改进：
//在调用方法的时候再明确数据类型，传什么样类型的数据，就接收什么样的数据类型
        Generic g=new Generic();
        g.show("刘德华");
        g.show(30);
        g.show(false);
        g.show("13.234");
    }

}
