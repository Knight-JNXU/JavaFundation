package code0;

/**
 * Created by Knight_JXNU on 2016/10/31.
 * java传入可变参数
 */
public class VariableParameter {
    @org.junit.Test
    public void test(){
        print("liuwen");
        print("liuwen", "shengwei");
        print("liuwen", "shengwei", "dingqinying");
    }

    public void print(String...strs){
        for(String s : strs){
            System.out.println(s);
        }
        System.out.println("---------------");
    }
}
