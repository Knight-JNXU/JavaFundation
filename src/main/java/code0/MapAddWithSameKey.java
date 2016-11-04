package code0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Knight_JXNU on 2016/10/12.
 * map 一个 key 只能对应一个 value，
 * 如果添加 map 中已经存在的 key value，
 * 新的 value 会覆盖 原来旧的 value
 */
public class MapAddWithSameKey {
    @org.junit.Test
    public void test(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "3");
        map.put("1", "2");
        System.out.print(map.get("1"));
    }
}
