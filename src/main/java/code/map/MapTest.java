package code.map;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest{
    
    @Test
    public void hashmapPutTest(){
        Map<String, String> teams = new HashMap<String, String>();
        teams.put("1", "code1024");
        teams.put("2", "geek");
        teams.put("3", "black");
        //新的value会覆盖旧的value
        teams.put("2", "geek1");
        System.out.println(teams);
    }
    
}
