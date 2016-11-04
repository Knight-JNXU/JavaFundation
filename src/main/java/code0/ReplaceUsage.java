package code0;

/**
 * Created by Knight_JXNU on 2016/10/12.
 * string replace
 */
public class ReplaceUsage {
    @org.junit.Test
    public void test(){
        String x = "fmn";
        //replace 后的结果需要用 string 接收
        String y = x.replace('f', 'F');
        y = y+"wxy";
        System.out.println(y);
    }
}
