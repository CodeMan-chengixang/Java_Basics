import java.util.Scanner;

/*## 题目7（综合）
已知一个数组 arr = {19, 28, 37, 46, 50};
键盘录入一个数据。定义一个方法，
完成查找该数据在数组中的索引，
并在控制台输出找到的索引值。*/
public class Practice_Demo7 {
    public static void main(String[] args) {
        int arr[] = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据：");
        int number = sc.nextInt();
        int index = getIndex(number, arr);
        System.out.println("index:" + index);
    }

    public static int getIndex(int number, int arr[]) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        return index;

    }
}

