package code0;

import org.junit.Test;

/**
 * Created by Knigh on 2017/1/9.
 * 探究实体方法是否可以调用抽象方法，抽象方法能否定义为静态的
 * result：
 * 1、没有编译报错，实体方法是可以调用抽象方法的
 * 2、抽象方法不能定义为static方法
 */
public abstract class EntityMtdUseAbstractMtd {
    public void entityMtd(){
        abstractMtd();
    }
    abstract public void abstractMtd();
    @Test
    public void test(){
        entityMtd();
    }

    public static void entityMtd2(){
//        abstractMtd2();
    }
    /**
     * 报错抽象方法不能定义为static类型的
     */
//    abstract public static void abstractMtd2();
    public static void main(String[] args){
        entityMtd2();
    }
}
