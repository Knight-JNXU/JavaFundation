package code0;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Knight_JXNU on 2016/11/16.
 * 整形数组的默认值
 */
public class IntArrDefaultValue {
    @Test
    public void test(){
        int arr[] = new int[3];
        System.out.println(Arrays.toString(arr));
        /**
         * console：
         * [0, 0, 0]
         * 可知new int array默认值为0
         */
    }
}
