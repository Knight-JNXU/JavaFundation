package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2017/2/17.
 * 探究 ++ 运算
 * Console：
 * 0
 * 分析：
 * ++运算相当于 int method(int i){return (i+1);} 方法
 */
public class PlusPlus {
    @Test
    public void test(){
        int count = 0;
        for(int i=0; i<10; i++){
            count = count++;
        }
        System.out.println(count);
    }
}
