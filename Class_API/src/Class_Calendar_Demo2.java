import java.util.Calendar;

/*【代码题】
用程序判断2018年2月14日是星期几。*/
public class Class_Calendar_Demo2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2019, 9, 20);
        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日是星期"+week);

    }
    public static char getWeek(int i){
        char[] week= new char[]{'天','一','二','三','四','五','六'};
        return week[i-1];
    }
}
