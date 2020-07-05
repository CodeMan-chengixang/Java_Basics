package Class_Set_TreeSet05;

public class Student implements Comparable<Student> {
    private String name;
    private int mathScore;
    private int chineseScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public Student(String name, int mathScore, int chineseScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
    }

    public Student() {
    }

    public int sumScore() {
        return this.chineseScore + this.mathScore;
    }

    @Override
    public int compareTo(Student o) {
        int i1 = o.sumScore() - this.sumScore();
        int i2 = (i1 == 0 ? this.name.compareTo(o.name) : i1);
        return i2;
    }
}
