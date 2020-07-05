package Predicate;

import java.util.function.Predicate;

/*### 常用函数式接口之Predicate【应用】
- Predicate接口
  Predicate<T>接口通常用于判断参数是否满足指定的条件
- 常用方法
  | boolean test(T t) | 对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回一个布尔值 |
  | default Predicate<T> negate() | 返回一个逻辑的否定，对应逻辑非                               |
  | default Predicate<T> and(Predicate other) | 返回一个组合判断，对应短路与                                 |
  | default Predicate<T> or(Predicate other)  | 返回一个组合判断，对应短路或                                 |*/
public class Predicate_Demo {
    public static void main(String[] args) {
//        boolean b1 = checkString("hello", s -> s.length() > 8);
//        System.out.println(b1);//false
//        boolean b2=checkString("hello world",s->s.length()>8);
//        System.out.println(b2);//true

        boolean b1 = checkString("hello", s -> s.length() > 8);
        System.out.println(b1);//true
        boolean b2 = checkString("hello world", s -> s.length() > 8);
        System.out.println(b2);//false

//        boolean b3 = checkString("hello", s -> s.length() > 8, s -> s.length() < 15);
//        System.out.println(b3);//false
//        boolean b4 = checkString("hello world", s -> s.length() > 8, s -> s.length() < 15);
//        System.out.println(b4);//true

        boolean b3 = checkString("hello", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b3);//true
        boolean b4 = checkString("hello world", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b4);//true


    }


    //判断给定的字符串参数是否满足要求
    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);

//        return !pre.test(s);
        return pre.negate().test(s);
    }

    //同一个字符串给出两个不同的判断条件，最后把两个判断的结果做逻辑与运算，其结果作为最终返回的结果
    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.and(pre2).test(s);

        return pre1.or(pre2).test(s);
    }
}
