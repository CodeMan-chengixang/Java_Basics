package CustomException_Demo2;

import java.util.Scanner;

public class Teacher {
    public int giveScore(){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();
        return score;
    }
    public void checkScore(int score) throws ScoreException {
        if (0 > score) {
            throw new ScoreException("分数不能为负数");
        } else {
            System.out.println("分数正常");
        }
    }
}
