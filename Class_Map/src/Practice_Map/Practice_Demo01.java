package Practice_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*练习五：HashMap存储键是自定义对象值是String
五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
并使用keySet和entrySet两种方式遍历Map集合。*/
public class Practice_Demo01 {
    public static void main(String[] args) {
        Map<Car, Double> hm = new HashMap<>();
        Car c1 = new Car("宝马X1", "白色");
        Car c2 = new Car("本田思域", "红色");
        Car c3 = new Car("雪佛兰大黄蜂", "黄色");
        Car c4 = new Car("奥迪Q5", "黑色");
        hm.put(c1, 27.88);
        hm.put(c2, 25.68);
        hm.put(c3, 35.98);
        hm.put(c4, 68.56);

//        keySet方式遍历Map集合
        Set<Car> cars = hm.keySet();
        for (Car c : cars) {
            Double price = hm.get(c);
            System.out.println(c.getName() + "," + c.getColor() + "," + price + "万");
        }
        System.out.println("--------");
//        entrySet方式遍历集合
        Set<Map.Entry<Car, Double>> entries = hm.entrySet();
        for (Map.Entry<Car, Double> me : entries) {
            Car c = me.getKey();
            Double price = me.getValue();
            System.out.println(c.getName() + "," + c.getColor() + "," + price + "万");
        }
    }
}
