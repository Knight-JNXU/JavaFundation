package code0;

/**
 * Created by Knight_JXNU on 2016/11/30.
 * 探究static和非static method是否可以同名
 * reuslt:
 * 同名，参数列表也相同的static method和非static method不能并存
 */
public class SameNameStaticMethod {
    public static void test(){

    }
    //编译错
//    public void PlusPlus(){
//
//    }
}
