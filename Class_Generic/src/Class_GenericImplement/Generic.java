package Class_GenericImplement;

/*泛型接口的实现类*/
public class Generic<T> implements GenericImplement<T> {
    @Override
    public <T1> void show(T1 t1) {
        if(t1 instanceof  Person){
            Person p=(Person)t1;
            p.name="zs";
            p.age=20;
            System.out.println(p);
        }
    }
}
