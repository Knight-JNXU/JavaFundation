package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Knight_JXNU on 2016/9/21.
 * list remove 用法
 */
public class ListRemove {
    @Test
    public void TestListRemove(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.remove(1);
        for (int i : list){
            System.out.print(i + " ");
        }
    }
}
