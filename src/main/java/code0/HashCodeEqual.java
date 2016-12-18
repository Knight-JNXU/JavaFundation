package code0;

import org.junit.Test;

/**
 * Created by Knigh on 2016/12/18.
 * 探究拥有不同hashCode的对象是否equal
 * console：
 * true
 * 分析：
 * 所以拥有不同hashCode的对象也能equal
 */
public class HashCodeEqual {
    private static int i=0;
    private class MyClass{
        @Override
        public int hashCode() {
            return i++;
        }

        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }
    @Test
    public void test(){
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.equals(myClass2));
    }
}
