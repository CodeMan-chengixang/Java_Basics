package CustomException_Demo;

public class Teacher {
    public void checkScore(int score) throws ScoreException {
        if (0>score||100<score){
                throw new ScoreException("您输入的分数有误，请输入0-100内的分数");
        }else {
            System.out.println("您输入的分数正常");
        }
    }
}
