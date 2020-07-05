/*## 题目6（综合）
设计一个方法，用于比较两个数组的内容是否相同。

### 训练提示

1. 数组内容相同，指的是元素个数相同，元素值相同，并且元素顺序相同，条件缺一不可。*/
public class Practice_Demo6 {
    public static void main(String[] args) {
        int arr1[] = {11, 22, 33, 44, 55, 66, 77, 88};
        int arr2[] = {11, 22, 33, 44, 55, 66, 77, 88};
        System.out.println(compareArray(arr1,arr2));

    }

    public static boolean compareArray(int a[], int b[]) {
        boolean flag = false;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
}
