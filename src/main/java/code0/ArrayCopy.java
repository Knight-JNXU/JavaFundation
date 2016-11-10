package code0;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Knight_JXNU on 2016/11/10.
 * 数组复制
 * 这个效率据说比for循环高
 */
public class ArrayCopy {
    @Test
    public void test(){
        int array1[] = {1, 3, 4, 6, 0};
        int array2[] = new int[array1.length];
        System.arraycopy(array1, 0, array2, 0, array2.length);
        System.out.println("array1:");
        System.out.println(Arrays.toString(array1));
        System.out.println("array2:");
        System.out.println(Arrays.toString(array2));
    }
}
