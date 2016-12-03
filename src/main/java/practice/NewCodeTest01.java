package practice;

/**
 * Created by Knight_JXNU on 2016/11/28.
 * 一道关于finally执行顺序的题目
 * Console：3423
 * 分析：可以看出finally是在try catch块之后必然执行的
 */
public class NewCodeTest01 {
    public static String output = "";
    public static void foo(int i){
        try {
            if(i == 1){
                throw new Exception();
            }
        }catch (Exception e){
            output += "2";
            return;
        }finally {
            output += "3";
        }
        output += "4";
    }
    public static void main(String[] args){
        foo(0);
        foo(1);
        System.out.println(output);
    }
}
