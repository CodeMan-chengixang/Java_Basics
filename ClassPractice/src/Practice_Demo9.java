import java.util.Scanner;

/*## 题目9（综合）
在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值
 (不考虑小数部分)。*/
public class Practice_Demo9 {
    public static void main(String[] args) {
        int score[] = new int[6];
        for (int i = 0; i < score.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请第" + (i + 1) + "个评委打分（0-100）：");
            score[i] = sc.nextInt();
        }
        System.out.println("选手的最后得分为：" + result(score));
    }

    //    定义一个打分的方法
//    获取最大值
//    获取最小值
//    获取分数和
    public static int result(int a[]) {
        int max = a[0];
        int min = a[0];
        int sum = 0;
        int ave = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
            if (a[i] <= min) {
                min = a[i];
            }
            sum += a[i];
        }
        ave = (sum - max - min) / (a.length - 2);
        return ave;
    }
}
