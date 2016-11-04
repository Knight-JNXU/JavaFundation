package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/4.
 * java assertion（断言）
 */
public class AssertionUsage {
    @Test
    public void test(){
        int num = -1;
        //assert 条件为 false 输出 assert 后的提示语句
        assert (num > 0) : "num 不能为负!";
        /**
         * console:
         * java.lang.AssertionError: num 不能为负!
         */
    }
}
