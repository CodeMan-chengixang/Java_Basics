/*## 题目3（训练）
定义项目经理类Manager。
属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
定义程序员类Coder。
属性：姓名name，工号id，工资salary。行为：工作work()
要求：
?    1.按照以上要求定义Manager类和Coder类,
属性要私有,生成空参、有参构造，set和get方法
?    2.定义测试类,
在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
?    3.调用成员方法,打印格式如下:
```
工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
工号为135基本工资为10000的程序员正在努力的写着代码......
```*/
/*程序员coder类*/
public class CoderClass {
    //    定义属性成员变量
    private String name;
    private int id;
    private double salary;

    //    提供空参构造方法
    public CoderClass() {
    }

    //    提供有参构造方法
    public CoderClass(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //    提供set/get方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    //    提供行为work（）方法
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员" + name + "正在努力的写着代码......");
    }

}
