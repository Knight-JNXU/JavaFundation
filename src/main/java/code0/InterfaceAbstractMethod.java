package code0;

/**
 * Created by Knight_JXNU on 2016/12/6.
 * 探究abstract method是否可以在interface中存在
 * result：
 * abstract method可以在interface中存在
 */
public class InterfaceAbstractMethod {
    private interface InterfaceTest{
        abstract void test();
//        private void test1();  //编译错
//        protected void test2();  //编译错
//        final void test3();  //编译错
    }
}
