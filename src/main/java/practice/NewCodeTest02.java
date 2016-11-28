package practice;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/28.
 */
public class NewCodeTest02 {
    @Test
    public void test(){
        byte b1=1, b2=2, b3, b6, b8;
        final byte b4=4, b5=6, b7;  //在这里没有给b7赋值居然没有出现编译错误，实在是出乎我的意料
//        b3=(b1+b2);  //编译错，b1+b2是int类型的
        b6=b4+b5;  //无编译错，貌似加了final修饰的byte不会升为int
//        b8=(b1+b4);  //编译错，b1+b4是int类型的
//        b7=(b2+b5);  //编译错，b2+b5是int类型的
//        System.out.println(b3+b6);  //编译错，没有初始化
    }
}
