package code0;

/**
 * Created by Knight_JXNU on 2016/12/9.
 * 探究 overide 和 overload 是否允许返回值不同
 * result：
 * overide 和 overload 的返回值都必须相同
 */
public class OverRideLoadRetnType {
    /**
     * overide
     */
    private String print(){
        return "";
    }
    //编译错，看来是不允许 overide 的返回值相同
//    private void print(){
//
//    }
    //这个又没有编译错，所以 overide 返回值相同或不相同都行，
    //只要求参数列表不同
    private String print(String str){return "";}


    private class Father{
        public void hello(){}
    }
    private class Son extends Father{
        //编译错，看来是不允许 overload 的返回值不同
//        public String hello(){return "hello";}
        //这个也没有编译错，所以 overload 返回值相同或不同都行,
        //只要求参数列表不同
        public String hello(String str){return "hello";};
    }
}
