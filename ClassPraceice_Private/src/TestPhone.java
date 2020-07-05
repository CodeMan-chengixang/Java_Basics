import com.sun.jdi.PathSearchingVirtualMachine;

/*## 题目1（训练）
定义手机类，
手机有品牌(brand),价格(price)和颜色(color)三个属性，
有打电话call()和sendMessage()两个功能。
请定义出手机类，类中要有空参、有参构造方法，set/get方法。
定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
调用对象的两个功能，打印效果如下：
        ```
正在使用价格为3998元黑色的小米手机打电话....
正在使用价格为3998元黑色的小米手机发短信....*/

//手机测试类
public class TestPhone {
    public static void main(String[] args) {
//使用无参构造方法创建对象后，使用set复制
        Phone p1 = new Phone();
        p1.setBrand("苹果");
        p1.setPrice(5999);
        p1.setColor("银");
//    使用有参构造方法，直接创建带有属性值的对象
        Phone p2 = new Phone("华为", 3999, "黑");
//        调用对象的两个功能
        p1.call();
        p1.sendMessage();
        p2.call();
        p2.sendMessage();

    }
}
