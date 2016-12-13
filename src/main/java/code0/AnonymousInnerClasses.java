package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/12/13.
 * 匿名内部类
 * 感觉匿名内部类就是在需要执行的方法内写出方法的实体，就有一定的时效性
 */
public class AnonymousInnerClasses {
    /**
     * 匿名内部类的基本实现
     */
    private abstract class Person{
        public abstract void eat();
    }
    @Test
    public void demo1(){
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("person eat!");
            }
        };
        p.eat();
    }

    /**
     * 在接口上使用匿名内部类
     */
    private interface People{
        public void eat();
    }
    @Test
    public void demo2(){
        People p = new People() {
            public void eat() {
                System.out.println("people eat!");
            }
        };
        p.eat();
    }
}
