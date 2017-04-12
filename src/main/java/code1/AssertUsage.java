package code1;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.*;

/**
 * @author knight
 * @createtime : 2017/04/11 23:27
 * @description : 断言的用法
 * @result :
 */

public class AssertUsage {

    /**
     * 比较两个数组是否相等
     */
    @Test
    public void arrayEqualsTest(){
        int array1[] = {1, 2, 3};
        int array2[] = {1, 2, 3};
        Assert.assertArrayEquals("should be equal", array1, array2);
    }

    /**
     * 把两个 new StringBuffer("222") 做个比较，方便下面的@Test结果预测
     * 注：equals方法在没有重写的情况下比较的是两个object的物理地址
     */
    @Test
    public void compareTwoStringBuffer(){
        System.out.println(new StringBuffer("222").equals(new StringBuffer("222")));
        System.out.println((new StringBuffer("222")) == (new StringBuffer("222")));
    }

    /**
     * 判断两个object是否相等
     * 比较物理地址
     */
    @Test
    public void assertEquallsTest(){
        Assert.assertEquals("should be equal", new StringBuffer("222"), new StringBuffer("222"));
    }
    /**
     * 判断两个object是否不相等
     * 比较物理地址
     */
    @Test
    public void assertNotEquallsTest(){
        Assert.assertNotEquals("should be not equal", new StringBuffer("222"), new StringBuffer("222"));
    }

    /**
     * 预期值为false
     */
    @Test
    public void assertFalseTest(){
        Assert.assertFalse("should be false", (new StringBuffer("222")).equals(new StringBuffer("222")));
    }

    /**
     * 预期值为true
     */
    @Test
    public void assertTrueTest(){
        assertTrue("should be true", new StringBuffer("222").equals(new StringBuffer("222")));
    }

    /**
     * 是否不相等
     * 比较物理地址
     */
    @Test
    public void assesrtNotSameTest(){
        Assert.assertNotSame("should be not same", new StringBuffer("222"), new StringBuffer("222"));
    }

    /**
     * 是否为null的判断
     */
    @Test
    public void assertNullTest(){
        Assert.assertNull("should be null", "");
    }

    /**
     * 是否相等
     * 比较物理地址
     */
    @Test
    public void assertSameTest(){
        Integer integer = new Integer("35");
        Assert.assertSame("should be same", integer, 35);
    }

    /**
     * both .and 是连接符
     * containsString 包含某个 String
     */
    @Test
    public void bothAndContainsStringTest(){
        Assert.assertThat("baby",
                both(containsString("ab")).and(containsString("by")));
    }

    /**
     * hasItems 是否包含某个item
     */
    @Test
    public void hasItemsTest(){
        Assert.assertThat(Arrays.asList(1, 2, 3), hasItems(1, 2));
    }

    /**
     * everyItem 是不是每个item都满足XXX
     */
    @Test
    public void everyItemTest(){
        Assert.assertThat(Arrays.asList(new String[]{"ab", "bc", "abc"}),
                everyItem(containsString("b")));
    }

    @Test
    public void hamcrestCoreMatchersTest(){
        Assert.assertThat("nice", allOf(equalTo("nice"), startsWith("n")));
        assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
        assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
        assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
        assertThat(new Object(), not(sameInstance(new Object())));
    }

}
