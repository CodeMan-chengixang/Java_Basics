/*需求：定义一个方法，使用StringBuilder方法把int类型数组中的数据，按照指定的格式，
拼接成一个字符串，调用该方法，并在控制台输出结果。
例如：数组为int arr[]={1,2,3}；
执行方法后的输出结果为[1,2,3]*/
public class StringBuilder_Demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String s = arrayToString(arr);
        System.out.println(s);

    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
