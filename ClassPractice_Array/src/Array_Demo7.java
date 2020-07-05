/*小李用自己的钱买了十只股票，年末他看了各只股票的收益
分别是
10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。
请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票
分别有多少只？打印效果如下：

```
赚钱的股票一共有：4只
赔钱的股票一共有：6只
```*/
public class Array_Demo7 {
    public static void main(String[] args) {
        double a[] = {10.4 / 100, -3.0 / 100, -6.2 / 100, 1.2 / 100, -6.1 / 100, -19.0 / 100, -3.8 / 100, 0.9 / 100, -4.5 / 100, 5.5 / 100};
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                count1++;
            } else if (a[i] < 0) {
                count2++;
            }
        }
        System.out.println("赚钱的股票一共有：" + count1 + "只");
        System.out.println("赔钱的股票一共有：" + count2 + "只");
    }
}
