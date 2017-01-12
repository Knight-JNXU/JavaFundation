package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2017/1/12.
 * 探究 stringbuffer capacity 的作用
 * result:
 * capacity返回初始化长度
 */
public class StringBufferCapacity {
    @Test
    public void test(){
        //StringBuffer(int)会创建一个初始长度为int的StringBuffer
        //length()返回字符串长度
        //capacity()返回初始化长度
        StringBuffer s1 = new StringBuffer(10);
        s1.append("1234");
        System.out.println(s1.length());
        System.out.println("1234".length());
        System.out.println("12".length());
        System.out.println(s1.capacity());
        s1 = new StringBuffer(1);
        System.out.println(s1.capacity());
    }
}
