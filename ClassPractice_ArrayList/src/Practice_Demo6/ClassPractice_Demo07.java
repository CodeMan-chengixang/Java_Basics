package Practice_Demo6;

/*## 题目7（练习）
定义一个方法，把 int 数组中的数据按照指定的格式
拼接成一个字符串返回，调用该方法，并在控制台输出结果。
要求：
?    1、如果传递的参数为空，返回null
?    2、如果传递的数组元素个数为0，返回[]
?    3、如果数组为int[] arr = {1,2,3}; ，
执行方法后的输出结果为：[1, 2, 3]*/
public class ClassPractice_Demo07 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String s = arrayToString(arr);
        System.out.println("输出结果为：" + s);
    }

    public static String arrayToString(int[] arr) {
        if (arr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i] + "]");
            } else {
                sb.append(arr[i] + ",");
            }
        }
        return sb.toString();
    }
}
