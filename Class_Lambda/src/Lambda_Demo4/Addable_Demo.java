package Lambda_Demo4;

/*- 练习描述

  有参有返回值抽象方法的练习

- 操作步骤
  - 定义一个接口(Addable)，里面定义一个抽象方法：int add(int x,int y);
  - 定义一个测试类(AddableDemo)，在测试类中提供两个方法
    - 一个方法是：useAddable(Addable a)
    - 一个方法是主方法，在主方法中调用useAddable方法*/
public class Addable_Demo {
    public static void main(String[] args) {
        //匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        System.out.println("----------------");

//        useAddable((int x,int y) -> {
//            return x+y;
//        });
        useAddable((x, y) ->  x+y);
    }

    private static void useAddable(Addable a) {
        int sum = a.add(5, 7);
        System.out.println(sum);
    }
}
