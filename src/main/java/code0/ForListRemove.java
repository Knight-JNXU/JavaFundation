package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Knight_JXNU on 2017/2/16.
 * 探究使用for循环遍历remove数组元素
 * result：
 * java.util.ConcurrentModificationException
 */
public class ForListRemove {
    @Test
    public void test(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for(String temp : a){
            if("1".equals(temp)){
                a.remove(temp);
            }
        }
        System.out.println(a);
        a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for(String temp : a){
            if("2".equals(temp)){
                a.remove(temp);
            }
        }
        System.out.println(a);
    }
}
