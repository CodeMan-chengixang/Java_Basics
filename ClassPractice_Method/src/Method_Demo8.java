import java.util.Random;

/*一个大V直播抽奖，奖品是现金红包，
分别有{2,588,888,1000,10000}五个奖金。
请使用代码模拟抽奖，打印出每个奖项，
奖项的出现顺序要随机且不重复。打印效果如下：
（随机顺序，不一定是下面的顺序）

```
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出
```*/
public class Method_Demo8 {
    public static void main(String[] args) {
        int[] arr1 = {2, 588, 888, 1000, 10000};
        int[] arr2 = new int[arr1.length];
        int index = 0;
        Random r = new Random();
        while (index < arr1.length) {
            int i = r.nextInt(arr1.length);
            if (equal(arr2, arr1[i])) {
                arr2[index] = arr1[i];
                index++;
                System.out.println(arr1[i] + "元的奖金被抽出");
            }
        }

    }

    public static boolean equal(int arr[], int a) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                flag = false;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
