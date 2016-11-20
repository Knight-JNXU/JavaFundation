package code0;

import org.junit.Test;

/**
 * Created by Knigh on 2016/11/20.
 * 测试 try catch 块能否起到回滚的作用
 * result:
 console:
 1
 2
 分析：看样子 try catch 块并不能起到类似 callback 的作用
 */
public class TryCatchCallback {
    private static class InnerClass{
        public static int i = 1;
        public void changeI(){
            try {
                i++;
                throw new Exception();
            }catch (Exception e){
                return;
            }

        }
    }
    @Test
    public void test(){
        InnerClass inner = new InnerClass();
        System.out.println(inner.i);
        inner.changeI();
        System.out.println(inner.i);
    }
}
