package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2017/2/9.
 * 探究new子类赋值给父类变量，该变量是否可以调用子类存在而父类不存在的方法
 * result：
 * 不行
 */
public class SuperclassNewSubclass {
    private class Base{
        public void method(){
            System.out.println("Base");
        }
    }
    private class Son extends Base{
        public void method(){
            System.out.println("Son");
        }
        public void methodB(){
            System.out.println("SonB");
        }
    }

    @Test
    public void test(){
        Base base = new Son();
        base.method();
        //报错 cannot resolve method 'methodB'
//        base.methodB();
    }
}
