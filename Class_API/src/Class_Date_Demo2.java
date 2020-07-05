import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*【代码题】
使用SimpleDateFormat类,
把2018-03-04转换为2018年03月04日*/
public class Class_Date_Demo2 {
    public static void main(String[] args) throws ParseException {
        String s = "2018-03-04";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String s1 = sdf2.format(d);
        System.out.println(s1);
    }
}
