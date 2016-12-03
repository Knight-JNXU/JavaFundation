package code0;

import org.junit.Test;

/**
 * Created by Knigh on 2016/12/3.
 * short 强制类型转换为 byte
 * console:
 * 128
 * -128
 * 分析：没有因为精度丢失而报错，这点令我感到诧异
 * a 的二进制 0000 0000 1000 0000
 * 截取后8位：1000 0000，符号位为1，表示负数，所以是-128
 */
public class Short2Byte {
    @Test
    public void test(){
        short a = 128;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);
    }
}
