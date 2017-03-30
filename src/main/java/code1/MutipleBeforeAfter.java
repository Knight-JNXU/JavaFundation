package code1;

import org.junit.After;
import org.junit.Before;
/**
* @author knight
* @createtime : 2017年3月30日 下午10:15:55
* @description : 多个@Before@After的执行顺序
* @result : 
* @Before修饰方法的执行顺序是名称的倒序
* @After修饰方法的执行顺序是名称的顺序
*/
import org.junit.Test;
public class MutipleBeforeAfter {

	@Before
	public void beforeMethod1(){
		System.out.println("before method 1");
	}
	@Before
	public void beforeMethod2(){
		System.out.println("before method 2");
	}
	@Before
	public void beforeMethod3(){
		System.out.println("before method 3");
	}
	@Before
	public void beforeMethod5(){
		System.out.println("before method 5");
	}
	@Before
	public void beforeMethod4(){
		System.out.println("before method 4");
	}
	@Test
	public void testMethod(){
		System.out.println("test method");
	}
	@After
	public void afterMethod1(){
		System.out.println("after method 1");
	}
	@After
	public void afterMethod2(){
		System.out.println("after method 2");
	}
	@After
	public void afterMethod3(){
		System.out.println("after method 3");
	}
	
	
}
