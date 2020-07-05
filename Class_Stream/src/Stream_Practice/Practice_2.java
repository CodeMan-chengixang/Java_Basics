package Stream_Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/*
《代码题》
2、
1.    使用lambda表达式分别将以下功能封装到Function对象中
a)    求Integer类型ArrayList中所有元素的平均数
b)    将Map<String,Integer>中value存到ArrayList<Integer>中
2.    已知学生成绩如下
姓名    成绩
岑小村    59
谷天洛    82
渣渣辉    98
蓝小月    65
皮几万    70
3.    以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩*/
public class Practice_2 {
    public static void main(String[] args) {
        Function<ArrayList<Integer>, Integer> fun1 = arrayList -> {
            int sum = 0;
            for (Integer i : arrayList) {
                sum += i;
            }
            return sum / arrayList.size();
        };
        
        Function<Map<String,Integer>,ArrayList<Integer>> fun2=map->
                new ArrayList<>(map.values());
        
        Map<String,Integer> map=new HashMap<>();
        map.put("岑小村",59);
        map.put("谷天洛",82);
        map.put("渣渣辉",98);
        map.put("蓝小月",65);
        map.put("皮几万",70);

        Integer aveGrade = fun2.andThen(fun1).apply(map);
        System.out.println("学生的平均成绩是"+aveGrade);
    }
}
