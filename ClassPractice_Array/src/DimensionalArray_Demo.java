public class DimensionalArray_Demo {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr);//[[I@61bbe9ba
        /*
        [[I@61bbe9ba

        [[ :几个中括号就代表几维数组
        I  :代表数组中存储的数据类型
        @  :分隔符
        61bbe9ba :十六进制内存地址
         */

        arr[0][0]=11;
        arr[0][1]=22;
        arr[0][2]=33;

        arr[1][0]=11;
        arr[1][1]=22;
        arr[1][2]=33;

        arr[2][0]=11;
        arr[2][1]=22;
        arr[2][2]=33;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        int[] arr1 = {11,22,33};
        int[] arr2 = {44,55,66};
        int[] arr3 = {77,88,99,100};

        int[][] dimArr = new int[3][3];

        //dimArr[2][3] = 100;// ArrayIndexOutOfBoundsException

        dimArr[0] = arr1;
        dimArr[1] = arr2;
        dimArr[2] = arr3;

        System.out.println(dimArr[1][2]);//66
        System.out.println(dimArr[2][3]);//100
    }
}
