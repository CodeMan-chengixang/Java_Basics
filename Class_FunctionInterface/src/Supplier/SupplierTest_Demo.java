package Supplier;

import java.util.function.Supplier;

/*### Supplier接口练习之获取最大值【应用】
- 案例需求
  定义一个类(SupplierTest)，在类中提供两个方法
  一个方法是：int getMax(Supplier<Integer> sup)用于返回一个int数组中的最大值
  一个方法是主方法，在主方法中调用getMax方法*/
public class SupplierTest_Demo {
    public static void main(String[] args) {
        int[] arr = {18, 23, 77, 33, 87, 44};

        int number = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i >= max) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println(number);

    }

    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
