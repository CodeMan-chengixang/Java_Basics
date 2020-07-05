/*
static ClassLoader getSystemClassLoader()返回用于委派的系统类加载器
ClassLoader getParent()返回父类加载器进行委派*/
public class ClassLoad_Demo {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        String name = systemClassLoader.getName();
        System.out.println(name);//app
        ClassLoader parent = systemClassLoader.getParent();
        String name1 = parent.getName();
        System.out.println(name1);//app
        ClassLoader parentParent = parent.getParent();
//        String name2 = parentParent.getName();
//        System.out.println(name2);
        System.out.println(parentParent);//null
    }
}
