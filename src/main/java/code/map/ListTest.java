package code.map;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTest{
    
    /**
     * 测试一下 ">>" 的功能
     * reuslt:运算符右移n位，相当于除以(2^n)
     */
    @Test
    public void operatorTest(){
        int baseValue = 10;
        int forTiems = 5;
        for(int i=0; i<forTiems; i++){
            System.out.println(baseValue + ">>" + i + ":" + (baseValue>>i));
        }
    }
    
    /**
     * 测试三目运算符功能
     */
    @Test
    public void ternaryOperatorTest(){
        System.out.println(1>2?true:false);
    }
    
    /**
     * add的时候如果elementData数组长度不够，把容量扩充为原来的1.5倍
     */
    @Test
    public void listTest(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(1));
    }

}
