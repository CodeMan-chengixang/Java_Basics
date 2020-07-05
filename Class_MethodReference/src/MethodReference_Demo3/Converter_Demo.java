package MethodReference_Demo3;
/*引用类方法，其实就是引用类的静态方法
- 格式
  类名::静态方法
- 范例
  Integer::parseInt
  Integer类的方法：public static int parseInt(String s) 将此String转换为int类型数据
- 练习描述
  - 定义一个接口(Converter)，里面定义一个抽象方法 int convert(String s);
  - 定义一个测试类(ConverterDemo)，在测试类中提供两个方法
    - 一个方法是：useConverter(Converter c)
    - 一个方法是主方法，在主方法中调用useConverter方法*/
public class Converter_Demo {
    public static void main(String[] args) {

        //Lambda表达式方法
        useConverter(s->Integer.parseInt(s));

        //引用类方法
        useConverter(Integer::parseInt);




    }
    private static void useConverter(Converter c){
        System.out.println(c.converter("23"));
    }
}
