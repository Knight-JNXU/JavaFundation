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
    private class Father{
        public void hello(){}
    }
    private class Son extends Father{
        //编译错，看来是不允许 overload 的返回值相同
//        public String hello(){return "hello";}
    }
}
