package code0;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Knight_JXNU on 2016/11/10.
 */
public class ArrayConnect {
    @Test
    public void test(){
        int a[] = {1, 3, 5};
        int b[] = {2, 4, 6};
        System.out.println(Arrays.toString(ArrayUtils.addAll(a, b)));
    }
}
