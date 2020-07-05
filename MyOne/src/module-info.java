import com.itheima03.MyService;
import com.itheima03.impl.Czxy;
import com.itheima03.impl.Itheima;

module MyOne {
    exports com.itheima01;
    exports com.itheima02;
    exports com.itheima03;

//    provides MyService with Czxy;
    provides MyService with Itheima;

}