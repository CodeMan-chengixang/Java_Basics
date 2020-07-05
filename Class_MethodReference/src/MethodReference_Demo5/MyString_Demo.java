package MethodReference_Demo5;

/*引用类的实例方法，其实就是引用类中的成员方法
- 格式
  类名::成员方法
- 范例
  String::substring
  public String substring(int beginIndex,int endIndex)
  从beginIndex开始到endIndex结束，截取字符串。返回一个子串，子串的长度为endIndex-beginIndex
- 练习描述
  - 定义一个接口(MyString)，里面定义一个抽象方法：
    String mySubString(String s,int x,int y);
  - 定义一个测试类(MyStringDemo)，在测试类中提供两个方法
    - 一个方法是：useMyString(MyString my)
    - 一个方法是主方法，在主方法中调用useMyString方法*/
public class MyString_Demo {
    public static void main(String[] args) {
        //Lambda表达式方法
        useMyString((s, x, y) -> s.substring(2, 6));

        //引用类的实例方法
        useMyString(String::substring);
        //Lambda表达式被类的实例方法代替的时候
        //第一个参数作为类的调用者
        //后面的参数全部传递给该方法的形式参数

    }

    private static void useMyString(MyString m) {
        String s = m.mySubString("HelloWorld", 2, 6);
        System.out.println(s);
    }
}
