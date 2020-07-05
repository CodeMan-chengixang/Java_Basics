/*## 题目8（综合）
?    已知一个数组 arr = {19, 28, 37, 46, 50};
用程序实现把数组中的元素值反转
(在原数组中操作，不能定义第二个数组)，
反转后的数组 arr = {50, 46, 37, 28, 19};
 并在控制台输出反转后的数组元素。*/
public class Practice_Demo8 {
    public static void main(String[] args) {
        int arr[] = {19, 28, 37, 46, 50};
        printArrary(arr);
        reverse(arr);
        printArrary(arr);
    }

    //    创建一个遍历输出数组的方法
    public static void printArrary(int a[]) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ",");
            }

        }
    }

    //    创建一个反转的方法
    public static void reverse(int a[]) {
        for (int start = 0, end = a.length - 1; start <= end; start++, end--) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }

    }

}
