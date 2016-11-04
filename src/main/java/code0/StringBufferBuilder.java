package code0;

/**
 * Created by Knight_JXNU on 2016/11/3.
 * StringBuffer StringBuilder 线程安全问题
 */
public class StringBufferBuilder {

    @org.junit.Test
    public void test(){
        /*
        查看 StringBuffer 源码可以发现，StringBuffer的很多方法都是有 synchronized 修饰的，
        故 StringBuffer 是线程安全的，如下是 StringBuffer 的 append(String var1) 的源码:
        public synchronized StringBuffer append(String var1) {
            super.append(var1);
            return this;
        }*/
        StringBuffer stringBuffer;
        /*
        反观 StringBuilder 基本上没有看到 synchronized 修饰
        故 StringBuilder 不是线程安全的，如下是 StringBuilder 的 append(String var1) 的源码:
        public StringBuilder append(String var1) {
            super.append(var1);
            return this;
        }*/
        StringBuilder stringBuilder;
    }

}
