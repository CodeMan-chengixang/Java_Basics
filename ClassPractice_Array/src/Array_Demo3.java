import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/*创建一个长度为6的整数数组。
请编写代码，随机生成六个0-100之间的整数存放到数组中，
然后再计算出数组中元素的和并打印。*/
public class Array_Demo3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "  ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("元素的和为：" + sum);
    }

}

