package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/18.
 * java 制表符的使用
 */
public class JavaTabUsage {
    @Test
    public void test(){
        StringBuffer sb = new StringBuffer("Name\t Expenditure\t Date\t Author\t Remarks\t\n");
        sb.append("lw\t 20.5\t 1016\\11\\18\t admin\t 遗留\t\n");
        System.out.println(sb.toString());
    }
}
