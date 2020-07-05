package Stream_Practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*《代码题》
7、
已知数组arr1中有如下元素{郭靖，杨康}，
arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合*/
public class Practice_6 {
    public static void main(String[] args) {
        String[] s1={"郭靖","杨康"};
        String[] s2={"黄蓉","穆念慈"};
        List<String> list = Stream.concat(Stream.of(s1), Stream.of(s2)).collect(Collectors.toList());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
