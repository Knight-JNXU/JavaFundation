package practice;

import java.util.Date;

/**
 * Created by Knigh on 2016/12/4.
 * 探究 getClass().getName(); 是否会把父类带出
 * console：
 * practice.NewCodeTest03
 * 分析：
 * 不会把父类的 class name 带出，但是会把包名带出，
 * 也就是说 getClass().getName(); 会把全类名带出
 */
public class NewCodeTest03 extends Date {
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }
    public static void main(String[] args){
        new NewCodeTest03().test();
    }
}
