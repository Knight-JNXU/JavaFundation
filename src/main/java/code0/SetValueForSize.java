package code0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/10/11.
 */
public class SetValueForSize {
    @org.junit.Test
    public void test(){
        List<String> list = new ArrayList<String>();
        System.out.println("size:" + list.size());
//        list.size() = 100;  //事实证明给 list 的 size 赋值是不行的

    }
}
