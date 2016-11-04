package code0;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * string substring 截取字符串
 */
public class SubstringUsage {
    @org.junit.Test
    public void test(){
        String str = "hello world!";
        System.out.println(str.substring(0, 0));
        System.out.println(str.substring(0, 2));
        System.out.println(str.substring(0, str.length()));
    }
}
