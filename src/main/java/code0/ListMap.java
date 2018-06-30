package code0;
/**
 * @author knightjxnu
 * @version 1.0
 * @date 2018年6月30日
 * @function : 替换List<Map>中的key
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.feilong.tools.slf4j.Slf4jUtil;

public class ListMap {
	
	private List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
	
	Map<String, String> targetMap = new HashMap<String, String>();
	
	String targetKey0 = "targetKey0";
	String targetKey1 = "targetKey1";
	String targetValue = "targetValue";
	
	@Before
	public void init() {
		targetMap.put(targetKey0, targetValue);
		listMap.add(targetMap);
	}
	
	
	
	public List<Map<String, String>> getListMap() {
		return listMap;
	}



	/**
	* TestListMap.
	*/
	@Test
	public void testListMap() {
		Map<String, String> keyReplaceMap = new HashMap<String, String>();
		keyReplaceMap.put(targetKey0, targetKey1);
		System.out.println(Slf4jUtil.format("before:{}", JSON.toJSONString(getListMap())));
		for (int i = 0, j = getListMap().size(); i < j; ++i) {
			Map<String, String> map = getListMap().get(i);
			for (Map.Entry<String, String> entry : map.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
//				if(targetKey0.equals(key)) {
				if(keyReplaceMap.keySet().contains(key)) {
					map.put(keyReplaceMap.get(key), value);
					map.remove(key);
				}
				
					
			}
			
		}
		System.out.println(Slf4jUtil.format("after:{}", JSON.toJSONString(getListMap())));
	}
	
}
