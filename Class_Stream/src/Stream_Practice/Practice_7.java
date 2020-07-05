package Stream_Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/*练习八：获取并发流
问题：
请分别写出获取并发流的两种方式。*/
public class Practice_7 {
    public static void main(String[] args) {
        Collection<Integer> coll=new ArrayList<>();
        Stream<Integer> parallelStreamA = coll.parallelStream();

        Stream<Integer> parallelStreamB = Stream.of(100, 200, 300, 4000).parallel();
    }
}
