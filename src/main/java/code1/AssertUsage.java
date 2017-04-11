package code1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author knight
 * @createtime : 2017/04/11 23:27
 * @description : 断言的用法
 * @result :
 */

public class AssertUsage {

    @Test
    public void arrayEqualsTest(){
        int array1[] = {1, 2, 3};
        int array2[] = {1, 2, 3};
        Assert.assertArrayEquals(array1, array2);
    }

}
