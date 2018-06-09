package code0;
/**
 * double + int 是否会对原 double 产生影响
 * reuslt：不会
 * @author knightjxnu
 * @version 1.0
 * @date 2018年6月9日
 */

import org.junit.Test;

public class DobulePlusInt {
	
	
	/**
	 * 测试double+int
	 * @author knightjxnu
	 */
	@Test
	public void testDobulePlusInt() {
		double d = 1.23;
		int i = 1;
		System.out.println("d+i:"+(d+i));
		d += i;
		System.out.println("d:"+d);
	}
	
}
