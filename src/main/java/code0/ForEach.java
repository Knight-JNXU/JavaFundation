package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Knight_JXNU on 2016/12/19.
 * 探究for-each循环在list或者map为空时是否会抛出NullPointerException
 * result:
 * null
 * 分析：
 * 没有抛出异常，所以for-each循环在list或者map为空时不会抛出NullPointerException
 */
public class ForEach {
    @Test
    public void test(){
        List<String> list = new ArrayList<String>();
        for (String s : list){
            System.out.println(s);
        }
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (String s : map.values()){
            System.out.println(s);
        }
        map.put(1, null);
        for (String s : map.values()){
            System.out.println(s);
        }
    }
}
