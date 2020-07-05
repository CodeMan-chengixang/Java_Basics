
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*可变参数的使用*/
public class Class_Args {
    public static void main(String[] args) {
        List<String> arrays = Arrays.asList("java", "hello", "world");
//Arrays中的asList（）方法返回的是大小固定的列表，
// 不能做增删操作，可以做修改操作
//        list.add("javaee");//UnsupportedOperationException
//        list.remove("java");//UnsupportedOperationException
        arrays.set(1, "你好");//[java, 你好, world]
        System.out.println(arrays);

//List接口中的of（）方法返回的是任意元素数量的不可变列表，
// 不能做增删操作，也不能做修改操作
        List<String> list1 = List.of("java", "hello", "world");
//        list1.add("javaee");//UnsupportedOperationException
//        list1.remove("java");//UnsupportedOperationException
//        list1.set(0,"javaee");//UnsupportedOperationException
        System.out.println(list1);

//Set接口中的of（）方法返回的是包含任意元素数量的不可变列表,且元素不可重复
//不能做增删操作，没有修改操作
//        Set<String> set = Set.of("hello", "world", "java","hello");//IllegalArgumentException
        Set<String> set = Set.of("hello", "world", "java");
//        set.add("javaee");//.UnsupportedOperationException
//        set.remove("java");//UnsupportedOperationException
        System.out.println(set);
    }
}
