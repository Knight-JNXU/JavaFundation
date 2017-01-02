package code0;

import org.junit.Test;

/**
 * Created by Knigh on 2017/1/2.
 * 定义的接口使用实现类的构造，能否使用相应实现类的方法实体
 * result:
 * animal eat
 * 分析：用的那个类的构造，就能使用哪个类的方法
 */
public class InterfaceAndClass {
    private interface Behavior{
        public void eat();
    }
    private class Aniaml implements  Behavior{
        public void eat() {
            System.out.println("animal eat");
        }
    }
    private class Dog implements Behavior{
        public void eat() {
            System.out.println("dog eat");
        }
    }
    @Test
    public void test(){
        Behavior behavior = new Aniaml();
        behavior.eat();
    }
}
