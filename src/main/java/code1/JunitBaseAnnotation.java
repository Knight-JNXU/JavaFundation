package code1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
* @author knight
* @createtime : 2017年3月30日 下午10:15:55
* @description : junit的一些基础注解
* @result : 
*/
public class JunitBaseAnnotation{
    @Before
    public void beforeMethod0(){
        System.out.println("before method 0");
    }
    
    /**
     * 即使是加了@Ignore注解，@Before中的内容还是会被执行
     */
    @Ignore
    @Before
    public void beforeMethod1(){
        System.out.println("before method 1");
    }
    
    /**
     * 被@Ignore修饰的@After注解依然生效
     */
    @Ignore
    @After
    public void afterMethod(){
        System.out.println("after method");
    }
    
    @Test
    public void testMethod0(){
        System.out.println("test method 0");
    }
    
    /**
     * 但是被@Ignore注解修饰的@Test注解不会生效
     */
    @Ignore
    @Test
    public void testMethod1(){
        System.out.println("test method 1");
    }
    
    @Test
//    public static void testMethod2(){
    //  这里不能用static修饰，因为下面的@BeforeClass已经是static的了
    //  如果这个method也使用static修饰，就不能保证@BeforeClass修饰的方法在它之前执行了
    public void testMethod2(){
        System.out.println("test method 2");
    }
    
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }
    
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

}
