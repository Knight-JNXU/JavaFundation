package practice;

/**
 * Created by Knight_JXNU on 2016/11/18.
 * 牛客网的一题单选
 * http://www.nowcoder.com/test/question/done?tid=6011114&qid=25212#summary
 */
public class NewCodeTest00 {
    public int add(int a,int b){
        try {
            return a+b;
        }
        catch (Exception e) {
            System.out.println("catch语句块");
        }
        finally{
            System.out.println("finally语句块");
        }
        return 0;
    }
    public static void main(String argv[]){
        NewCodeTest00 test =new NewCodeTest00();
        System.out.println("和是："+test.add(9, 34));
    }
}
