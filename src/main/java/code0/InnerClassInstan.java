package code0;

/**
 * Created by Knight_JXNU on 2016/11/3.
 * java 内部类实例化
 */
public class InnerClassInstan {

    class Out{
        public class Inner{

        }
    }
    @org.junit.Test
    public void test(){
        Out.Inner inner = (new Out()).new Inner();
    }
}
