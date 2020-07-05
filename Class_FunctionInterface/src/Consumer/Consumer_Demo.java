package Consumer;

import java.util.function.Consumer;

/*- Consumer接口
  Consumer<T>接口也被称为消费型接口，它消费的数据的数据类型由泛型指定
- 常用方法
  Consumer<T>：包含两个方法                                                                                                |  | ---------------------------------------------------- | ---------------------------------------------------------- |
  | void  accept(T t)| 对给定的参数执行此操作
  | default Consumer<T> andThen(Consumer after)
  | 返回一个组合的Consumer，依次执行此操作，然后执行 after操作 */
public class Consumer_Demo {
    public static void main(String[] args) {
        operatatorString("刘德华",s-> System.out.println(s));
        operatatorString("刘德华",s -> System.out.println(
                new StringBuilder(s).reverse().toString()));
        System.out.println("------------");

        operatatorString("刘德华",s-> System.out.println(s),
                s-> System.out.println(new StringBuilder(s).reverse().toString()));

    }

    private static void operatatorString(String s, Consumer<String> con) {
        con.accept(s);
    }
    private static void operatatorString(String s, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(s);
    }
}
