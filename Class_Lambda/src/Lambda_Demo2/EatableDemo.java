package Lambda_Demo2;

import java.util.Arrays;
import java.util.Comparator;

/*- 练习描述

  ​	无参无返回值抽象方法的练习

- 操作步骤
  - 定义一个接口(Eatable)，里面定义一个抽象方法：void eat();
  - 定义一个测试类(EatableDemo)，在测试类中提供两个方法
    - 一个方法是：useEatable(Eatable e)
    - 一个方法是主方法，在主方法中调用useEatable方法*/
public class EatableDemo {
    public static void main(String[] args) {
        Integer[] arr={9,1,5,2,9};
        for (Integer integer : arr) {
            System.out.print(integer+",");
        }
        System.out.println();
        Arrays.sort(arr,(a,b)->a-b);
        for (Integer integer : arr) {
            System.out.print(integer+",");
        }

        //调用useEatable方法
        //方式一：创建接口的实现类对象
        Eatable e=new EatableImpl();
        useEatable(e);

        //方式二：匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });

        //方式三：
//        useEatable(()->{
//          System.out.println("一天一苹果，医生远离我");
//        });
        useEatable(()->System.out.println("一天一苹果，医生远离我"));

    }

    private static void useEatable(Eatable e) {
        e.eat();
    }

}
