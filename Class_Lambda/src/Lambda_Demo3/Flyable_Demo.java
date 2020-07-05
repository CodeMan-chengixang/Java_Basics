package Lambda_Demo3;

/*- 练习描述

  有参无返回值抽象方法的练习

- 操作步骤

  - 定义一个接口(Flyable)，里面定义一个抽象方法：void fly(String s);
  - 定义一个测试类(FlyableDemo)，在测试类中提供两个方法
    - 一个方法是：useFlyable(Flyable f)
    - 一个方法是主方法，在主方法中调用useFlyable方法*/
public class Flyable_Demo {
    public static void main(String[] args) {
//        useFlyable((String s) -> {
//            System.out.println(s);
//            System.out.println("飞机自驾游");
//        });
        useFlyable(s -> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }
}
