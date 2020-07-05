package Stream_Practice;

import java.util.Arrays;
import java.util.stream.Stream;

/*《代码题》
6、
有如下整数1，-2，-3，4，-5
使用Stream取元素绝对值并打印
*/
public class Practice_5 {
    public static void main(String[] args) {
        Integer[] arr={1,-2,-3,4,5};
//        Stream.of(arr).map(Math::abs).forEach(System.out::println);

        Arrays.stream(arr).map(Math::abs).forEach(System.out::println);
    }
}
