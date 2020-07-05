package Class_Properties;

import java.util.Random;
import java.util.Scanner;

public class Game_GessNumber {
    public static void start() {
        Random r = new Random();
        int i = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜的数字（1-100）：");
            int number = sc.nextInt();
            if (number < 1 || number > 100) {
                System.out.println("你输入的数字不在范围内，请重新输入");
            } else if (i > number) {
                System.out.println("你猜的数字" + number + "小了");
            } else if (i < number) {
                System.out.println("你猜的数字" + number + "大了");
            } else if (i == number) {
                System.out.println("恭喜你，" + number + "猜对了");
                break;
            }
        }
    }

}

