package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/11/16.
 * 利用list求并集、交集、补集
 */
public class ListUsage {
    @Test
    public void test(){
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(4);
        list2.add(5);
        //并集，简单的相加，不会去掉重复的元素
        List<Integer> temp = new ArrayList<Integer>();
        temp.addAll(list1);  //这一步是把list1拷贝到temp，这样改变temp的时候，不会改变list1
        temp.addAll(list2);
        System.out.println(temp);
        //交集
        temp = new ArrayList<Integer>();
        temp.addAll(list1);
        temp.retainAll(list2);
        System.out.println(temp);
        //补集，list1有，但是list2没有
        temp = new ArrayList<Integer>();
        temp.addAll(list1);
        temp.removeAll(list2);
        System.out.println(temp);
    }
}
