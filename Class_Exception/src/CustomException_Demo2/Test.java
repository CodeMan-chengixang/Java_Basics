package CustomException_Demo2;

/*问题：
请使用代码实现
每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定异常*/
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId("java003");
        s.setName("张三丰");
        Teacher t = new Teacher();
        int score = t.giveScore();
        try {
            t.checkScore(score);
            s.setScore(score);

        } catch (ScoreException e) {
            e.printStackTrace();
        }
        System.out.println("学号为" + s.getId() + "的" + s.getName() + "学生分数是" + s.getScore());
    }
}
