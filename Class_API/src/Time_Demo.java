import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time_Demo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("请选择主题：");
        System.out.println("1.***年**月**日；2.****-**-**;3.****/**/**");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                DateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
                String date1 = sdf1.format(date);
                System.out.println("主题切换成功，当前时间为：" + date1);
                break;
            case 2:
                DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                String date2 = sdf2.format(date);
                System.out.println("主题切换成功，当前时间为：" + date2);
                break;
            case 3:
                DateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
                String date3 = sdf3.format(date);
                System.out.println("主题切换成功，当前时间为：" + date3);
                break;
            default:
                DateFormat sdf0 = new SimpleDateFormat("yyyy年MM月dd日");
                String date0 = sdf0.format(date);
                System.out.println("很抱歉，操作有误，已为您切换为默认主题" + date0);
        }

    }
}
