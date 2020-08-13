package quicklySort;

import java.util.Arrays;

public class MyQuicklySort {
    //快速排序（使用递归）
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        /*quicklySort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicklySort(int[] arr, int left, int right) {
        if (left > right) {
            return ;
        }
        int right0 = right;
        int left0 = left;
        int baseNumber = arr[left0];
        while (right != left) {
            //从右边开始找比基准数小的
            while (baseNumber <= arr[right] && left < right) {
                right--;
            }
            //从左边开始找比基准数大的
            while (baseNumber >= arr[left] && left < right) {
                left++;
            }

            //交换位置
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

        }

        //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0]=temp;

        //递归调用排序左边
        quicklySort(arr,left0,left-1);
        //递归调用排序右边
        quicklySort(arr,left+1,right0);
    }
}
