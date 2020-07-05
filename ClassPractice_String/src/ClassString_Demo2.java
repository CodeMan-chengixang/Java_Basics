/*定义一个方法，把int类型数组中的数据，按照指定的格式，
拼接成一个字符串，调用该方法，并在控制台输出结果。
例如：数组为int arr[]={1,2,3}；
执行方法后的输出结果为[1,2,3]*/
public class ClassString_Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String s = arrayToString(arr);
        System.out.println("结果为："+s);
    }

    public static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i] + ",";
            }
        }
        s += "]";
        return s;
    }
}
