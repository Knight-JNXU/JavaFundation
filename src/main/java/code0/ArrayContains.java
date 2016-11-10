package code0;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/11/10.
 * 数组是否包含某个元素
 */
public class ArrayContains {
    @Test
    public void test(){
        Integer array[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.asList(array).contains(new Integer(1)));
        //基类不能使用这种方式判断出数组是否包含某个元素，因为int类型array在Arrays.asList后返回的List<Integer>
        int array2[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.asList(array2).contains(1));
    }
}
