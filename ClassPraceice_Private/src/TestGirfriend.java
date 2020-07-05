/*## 题目2（训练）
定义一个女朋友类。
女朋友的属性包含：姓名，身高，体重。
行为包含：洗衣服wash()，做饭cook()。
另外定义一个用于展示三个属性值的show()方法。
请在测试类中通过有参构造方法创建对象并赋值，
然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
```
我女朋友叫凤姐,身高155.0厘米,体重130.0斤
女朋友帮我洗衣服
女朋友给我做饭
```*/
/*女朋友测试类*/
public class TestGirfriend {
    public static void main(String[] args) {
/* //    通过无参构造方法创建对象后，再通过set给对象赋值
        Girfriend g = new Girfriend();
        g.setName("迪丽热巴");
        g.setHeight(165);
        g.setWeight(89);*/
//        通过有参构造方法创建对象直接赋值
        Girfriend g = new Girfriend("范冰冰", 170, 100);
//        调用方法
        g.showGirfriend();
        g.wash();
        g.cook();
    }

}
