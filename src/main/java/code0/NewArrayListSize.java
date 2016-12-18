package code0;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Knigh on 2016/12/18.
 * 探究new出来的ArrayList的size
 * console：
 * 0
 * 分析：new出来的ArrayList的size为0
 */
public class NewArrayListSize {
    @Test
    public void test(){
        System.out.println(new ArrayList<Integer>().size());
    }
}
