/*有一个整数数组。请编写代码，
让数组的最后一个元素代表个位，倒数第二个元素代表十位，
以此类推。最终得到一个大的整数。比如：
```
原数组：{1,2,3,4,5}
最终得到的结果： 12345
```*/
public class Array_Demo4 {
    public static void main(String[] args) {
        int[] arr = {6, 4, 9, 3, 5};
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            number = number * 10 + arr[i];
        }
        System.out.println();
        System.out.println("最终得到的数为：" + number);
    }
}
