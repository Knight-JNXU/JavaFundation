package code0;

/**
 * Created by Knight_JXNU on 2016/11/28.
 * String intern 可以返回 String 在运行时常量池中的引用，native 方法
 */
public class StringIntern {
    public static void main(String[] args){
        System.out.println("java".intern());
    }
}
