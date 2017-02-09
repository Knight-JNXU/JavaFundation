package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2017/2/7.
 * 探究ceil、floor的符号问题
 * Console：
 * Ceil d1=-0.0
 * floor d1=-1.0
 * 分析：ceil floor结果的符号和原数据的符号是一致的
 */
public class CeilFloorSymbol {
    @Test
    public void test(){
        double d1 = -0.5;
        System.out.println("Ceil d1="+Math.ceil(d1));
        System.out.println("floor d1="+Math.floor(d1));
    }
}
