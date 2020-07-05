package Supplier;

import java.util.function.Supplier;

/*### 常用函数式接口之Supplier【应用】
- Supplier接口
 Supplier<T>接口也被称为生产型接口，如果我们指定了接口的泛型是什么类型，
 那么接口中的get方法就会生产什么类型的数据供我们使用。
- 常用方法
  只有一个无参的方法
  | 方法名  |                       说明                       |
  | T get() | 按照某种实现逻辑(由Lambda表达式实现)返回一个数据 |*/
public class Supplier_Demo {
    public static void main(String[] args) {
        String s = getString(() -> "刘德华");
        System.out.println(s);

        Integer i = getInteger(() -> 45);
        System.out.println(i);
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }

    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }
}
