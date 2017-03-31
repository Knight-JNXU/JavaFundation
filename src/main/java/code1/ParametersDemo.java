package code1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
* @author knight
* @createtime : 2017年3月31日 下午10:43:31
* @description : @Parameters & @Parameter注解的用法
* @result : 
*/
class DataOpration{
	
	public static int add(int par1, int par2){
		return (par1+par2);
	}
	
}
@RunWith(Parameterized.class)
public class ParametersDemo {
	
	@Parameters(name = "{index}:add({0}, {1})={2}")
	//这里使用 Collection 和 Iterable 都行
	public static Collection<Object[]> data(){
//		public static Iterable<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{1, 1, 2}, {1, 2, 3}, {2, 3, 5}
		});
	}
	
	@Parameter(0)
	public int par1;
	@Parameter(1)
	public int par2;
	@Parameter(2)
	public int sum;
	
	@Test
	public void test(){
		assertEquals(sum, DataOpration.add(par1, par2));
	}
	
}
