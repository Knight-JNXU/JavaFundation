package code1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTestTemp{
    @Before
    public void beforeMethod(){
        System.out.println("before method");
    }
    
    @After
    public void afterMethod(){
        System.out.println("after method");
    }
    
    @Test
    public void testMethod(){
        System.out.println("test method");
    }

}
