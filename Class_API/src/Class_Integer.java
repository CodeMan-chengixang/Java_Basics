import java.util.Arrays;

/*需求：有一个字符串“124 45 67 12 166 77 9 34”
 *请写程序实现最终输出结果是"9 12 34 45 67 77 124 166"*/
public class Class_Integer {
    public static void main(String[] args) {
        String s = "124 45 67 12 166 77 9 34";
        System.out.println(s);
// 用String类中的split（）方法拆分字符串，并返回一个字符串数组
        String[] s1 = s.split(" ");
      /*   for (int i = 0; i < s1.length; i++) {
              System.out.println(s1[i]);
            }*/
//      将字符串数组转化为int类型数组
        int[] arr = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
//        将数组中的int数据进行排序
        Arrays.sort(arr);
//        将数组转为字符串，按要求输出结果
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + " ");
            }

        }
        String result = sb.toString();
        System.out.println("结果为：" + result);
    }
}
