package code0;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/12/5.
 * 探究asList
 * console:
 * 1
 * [I@477afcff
 * 分析：
 * int[] 转为 list 之后，类型变成了 int[]
 */
public class ArraysasList {
    @Test
    public void test(){
        int[] array = {1,2,3,4};
        //这个的返回值类型是 Arrays.ArrayList class，这个 class 实现了 List 接口
        List list = Arrays.asList(array);
        System.out.println(list.size());
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
