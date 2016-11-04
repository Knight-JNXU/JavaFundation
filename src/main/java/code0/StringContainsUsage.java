package code0;

/**
 * Created by Knight_JXNU on 2016/10/17.
 */
public class StringContainsUsage {
    @org.junit.Test
    public void test(){
        String strs[] = {" coder", "Coder", "cOder", "cOdEr"};
        for(String s : strs){
            //可以发现 contains 是区分大小写的
            if(s.contains("coder")){
                System.out.println(s);
            }
        }
    }
}
