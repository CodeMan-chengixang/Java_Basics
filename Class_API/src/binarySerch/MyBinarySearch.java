package binarySerch;

public class MyBinarySearch {
    //二分查找
    public static void main(String[] args) {
        int[] arr = {2, 6, 11, 14, 23, 28, 34, 35, 44, 46, 51, 67, 70, 88, 94};
        int number = 92;
        int index = binarySearchForIndex(arr, number);
        System.out.println(index);
    }

    private static int binarySearchForIndex(int[] arr, int number) {
        int index = -1;
        int min = 0;
        int max = arr.length;
        while (min <= max) {
            //int mid = (min + max) / 2;
            int mid = (min + max) >> 1; //右移一位，也就是除以2
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else if (arr[mid] == number) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
