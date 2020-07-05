/*## 题目4（综合）
?    我国古代数学家张丘建在《算经》一书中提出的数学问题：
鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
?    百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？*/
public class Practice_Demo4 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        for (x = 0; x <= 20; x++) {
            for (y = 0; y <= 33; y++) {
                for (z = 0; z <= 100; z++) {
                    if ((z % 3) == 0 && (x + y + z) == 100 && (5 * x + 3 * y + z / 3) == 100) {
                        System.out.println("公鸡" + x + "只，母鸡" + y + "只，雏鸡" + z + "只");
                    }
                }
            }

        }
    }

}
