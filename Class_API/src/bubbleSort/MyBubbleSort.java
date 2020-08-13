package bubbleSort;

public class MyBubbleSort {
    //冒泡排序
    public static void main(String[] args) {
        int[] arr = {20, 40, 70, 30, 50, 10, 60, 80, 100, 90};
        int[] sortedArray = bubbleSortForArray(arr);
        printArray(sortedArray);
    }

    private static int[] bubbleSortForArray(int[] arr) {
        int temp;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] >= arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
