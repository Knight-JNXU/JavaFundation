package code0;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/12/5.
 * 探究asList
 */
public class ArraysasList {
    private void test(){
        int[] array = {1,2,3,4};
        //这个的返回值类型是 Arrays.ArrayList class，这个 class 实现了 List 接口
        List list = Arrays.asList(array);
    }
}
