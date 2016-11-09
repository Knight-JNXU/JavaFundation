package code0;

/**
 * Created by Knigh on 2016/11/9.
 * 先执行if，再执行else
 * 问题来源：https://www.zhihu.com/question/50801791
 * 往if中填入一个条件，使下列的if-else语句输出ab
     if(){
         System.out.print("a");
     }else{
     System.out.print("b");
     }
 */
public class PrintAB {

    public static void main(String[] args){
        if((new Object(){
            public boolean foo() {
                System.out.print("a");
                return false;
            }
        }).foo()){
            System.out.print("a");
        }else{
            System.out.print("b");
        }
        System.out.println("\n-----------");
        //引用R哥的回答：PrintStream.printf()会返回this
        if(System.out.printf("a")==null){
            System.out.print("a");
        }else{
            System.out.print("b");
        }
        System.out.println("\n-----------");
        if(f()){
            System.out.print("a");
        }else{
            System.out.print("b");
        }
    }
    private static boolean f(){
        System.out.print("a");
        return false;
    }
}
