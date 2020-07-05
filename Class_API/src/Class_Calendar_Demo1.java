import java.util.Calendar;
import java.util.Scanner;

/*获取任意一年的二月的天数*/
public class Class_Calendar_Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, 2);
        c.set(Calendar.DATE, 1);
        c.add(Calendar.DATE, -1);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年的二月有" + date + "天");

    }
}
