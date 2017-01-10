package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2017/1/10.
 * 探究null是否可以调用static方法
 * result：
 * @Test
 * hello
 * main
 * hello
 * 值为null的object还是可以调用相应class的static方法
 */
public class NullObjStaticMtd {
    public static void sayhello(){
        System.out.println("hello");
    }
    @Test
    public void test(){
        NullObjStaticMtd nullObjStaticMtd = null;
        nullObjStaticMtd.sayhello();
    }
    public static void main(String[] args){
        NullObjStaticMtd nullObjStaticMtd = null;
        nullObjStaticMtd.sayhello();
    }
}
