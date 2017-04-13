package code.map;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RepeatedKey{
    
    @Test
    public void test1(){
        Map<String, String> teams = new HashMap<String, String>();
        teams.put("1", "code1024");
        teams.put("2", "geek");
        teams.put("3", "black");
        System.out.println(teams);
    }
}
