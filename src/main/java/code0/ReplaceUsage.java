package code0;

/**
 * Created by Knight_JXNU on 2016/10/12.
 */
public class ReplaceUsage {
    @org.junit.Test
    public void test(){
        String x = "fmn";
        String y = x.replace('f', 'F');
        y = y+"wxy";
        System.out.println(y);
    }
}
