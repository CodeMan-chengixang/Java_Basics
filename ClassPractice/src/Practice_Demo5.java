/*## 题目5（综合）

有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。
求出该数组中满足要求的元素和，
要求是：求和的元素个位和十位都不能是7，并且只能是偶数。
### 训练提示

1. 需要使用for循环完成求和。
2. 需要判断个位，十位和偶数，需要if语句。*/
public class Practice_Demo5 {
    public static void main(String[] args) {
        int arr[] = {68, 27, 95, 88, 171, 996, 51, 210};
        System.out.println("满足条件的元素和为" + getMySum(arr));
    }

    public static int getMySum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && (arr[i] % 10) != 7 && (arr[i] / 10 % 10) != 7 ) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
