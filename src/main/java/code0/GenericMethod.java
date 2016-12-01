package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/12/1.
 * 泛型方法
 console:
 3
 3.0
 ABC
 c
 */
public class GenericMethod {
    private <T> void out(T t){
        System.out.println(t.toString());
    }
    @Test
    public void test(){
        out(3);
        out(3.0);
        out("ABC");
        out('c');
    }
}
