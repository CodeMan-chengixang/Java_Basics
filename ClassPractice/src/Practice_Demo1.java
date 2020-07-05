import java.util.Scanner;

/*## 题目1(综合)
通过键盘录入的方式输入星期数(1-7的整数)，
显示今天的减肥活动，使用switch和if两种判断语句分别完成。
?            周一：跑步
?            周二：游泳
?            周三：慢走
?            周四：动感单车
?            周五：拳击
?            周六：爬山
?            周日：好好吃一顿*/
public class Practice_Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();
//        if语句
      /*  if (week == 1) {
            System.out.println("周一：跑步");
        } else if (week == 2) {
            System.out.println("周二：游泳");
        } else if (week == 3) {
            System.out.println("周三：慢走");
        } else if (week == 4) {
            System.out.println("周四：动感单车");
        } else if (week == 5) {
            System.out.println("周五：拳击");
        } else if (week == 6) {
            System.out.println("周六：爬山");
        } else if (week == 7) {
            System.out.println("周日：好好吃一顿");
        } else {
            System.out.println("您输入错误");
        }*/
//      switch语句
        switch (week) {
            case 1:
                System.out.println("周一：跑步");
                break;
            case 2:
                System.out.println("周二：游泳");
                break;
            case 3:
                System.out.println("周三：慢走");
                break;
            case 4:
                System.out.println("周四：动感单车");
                break;
            case 5:
                System.out.println("周五：拳击");
                break;
            case 6:
                System.out.println("周六：爬山");
                break;
            case 7:
                System.out.println("周日：好好吃一顿");
                break;
            default:
                System.out.println("您输入错误");
                break;
        }
    }
}
