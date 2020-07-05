package Class_GenericMethod;
/*泛型类*/
//方式一：不用泛型类的方式：将来调用show（）方法，必须提供对应的数据类型的show方法
/*public class Generic {
    public void show(String s){
        System.out.println(s);
    }
    public void show(Integer i){
        System.out.println(i);
    }
    public void show(Boolean b){
        System.out.println(b);
    }
}*/

//方式二：使用泛型类的方式：
// 只需提供一个泛型数据类型的show（）方法，任何数据类型都可以调用show（）方法
/*public class Generic<T>{
    public void show(T t){
        System.out.println(t);
    }
}*/

//方式三：使用泛型方法进一步改进：
//在调用方法的时候再明确数据类型，传什么样类型的数据，就接收什么样的数据类型
public class Generic{
    public <T> void show(T t){
        System.out.println(t);
    }
}