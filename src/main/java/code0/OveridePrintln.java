package code0;

import java.io.PrintStream;

/**
 * Created by Knight_JXNU on 2017/2/10.
 * 探究println的重写
 * Console：
 * a=100
 * b=200
 */
public class OveridePrintln {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        method1(a, b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    private static void method1(int a, int b){
        PrintStream myStream = new PrintStream(System.out){
            public void println(String x){
                if("a=10".equals(x)){
                    x="a=100";
                }else{
                    x="b=200";
                }
                super.println(x);
            }
        };
        System.setOut(myStream);
    }
}
