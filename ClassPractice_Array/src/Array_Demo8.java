/*定义一个数组其中包含多个数字。用自己的方式最终实现:
奇数放在数组的左边，偶数放在数组的右边。
（可以创建其他数组，不必须在原数组中改变）*/
public class Array_Demo8 {
    public static void main(String[] args) {
        int arr1[] = {25, 8, 5, 86, 9, 4, 87, 12, 43, 34, 55, 32, 56, 52};
        int arr2[] = new int[arr1.length];
        int left = 0;
        int right = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[left] = arr1[i];
                left++;
            } else if (arr1[i] % 2 == 1) {
                arr2[right] = arr1[i];
                right--;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("---------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
