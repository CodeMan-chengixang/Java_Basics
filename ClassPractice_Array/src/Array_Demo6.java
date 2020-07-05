import java.util.Scanner;

/*有一个数组，其中有十个元素从小到大依次排列
 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
 执行效果如下：
```
请输入一个整数数字：
50
生成的新数组是：12 14 23 45 50 66 68 70 77 90
```*/
public class Array_Demo6 {
    public static void main(String[] args) {
        int[] arr1 = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr2 = new int[arr1.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (number >= arr1[i]) {
                arr2[i] = arr1[i];
            } else {
                arr2[i + 1] = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                arr2[i] = number;
            }
            System.out.print(arr2[i] + " ");
        }
    }
}
