package code0;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Knight_JXNU on 2016/12/19.
 * 探究遍历map的方式
 */
public class MapTravering {
    private Map<Integer, String> map = new HashMap<Integer, String>();
    {
        map.put(4005, "liuwen");
        map.put(4004, "qinying");
        map.put(4003, "shengwei");
    }
    @Test
    public void test1(){
        for(Map.Entry<Integer, String> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
    }
    @Test
    public void test2(){
        for (Integer i : map.keySet()){
            System.out.println("key="+i);
        }
        for (String s : map.values()){
            System.out.println("value="+s);
        }
    }
    @Test
    public void test3(){
        Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
    }
    @Test
    //此方法效率较低
    public void test4(){
        Iterator entries = map.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry entry = (Map.Entry)entries.next();
            Integer key = (Integer) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("key="+key+",value="+value);
        }
    }
    @Test
    public void test5(){
        for (Integer key : map.keySet()){
            String value = map.get(key);
                System.out.println("key="+key+",value="+value);
        }
    }
}