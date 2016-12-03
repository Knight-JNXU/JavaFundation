package code0;

import org.junit.Test;

/**
 * Created by Knigh on 2016/12/3.
 * instanceof用法，交换前后元素的位置
 * cosole:
 * false
 * true
 * 分析：
 * 不难发现，son 是属于 Person class的
 * 但是 parent 是不属于 Son class的
 */
public class InstanceofUsage {
    private class Perent{}
    private class Son extends Perent{}
    @Test
    public void test(){
        Perent perent = new Perent();
        Son son = new Son();
        System.out.println((perent instanceof Son));
        System.out.println((son instanceof Perent));
    }
}
