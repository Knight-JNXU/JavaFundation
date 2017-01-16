package code0;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by Knight_JXNU on 2017/1/16.
 * 探究 Callable接口 的作用
 * result：
 mc2：Thread-1 run!
 mc1：Thread-0 run!
 mc1：Thread-0 finished!
 mc2：Thread-1 finished!
 * 分析：感觉就像是有返回值的Runnable
 */
public class CallableUsage {
    private class MyCallable implements Callable<String>{
        private String name;

        public MyCallable(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String call() throws Exception {
            System.out.println(name+"："+Thread.currentThread().getName()+" run!");
            return (name+"："+Thread.currentThread().getName()+" finished!");
        }
    }

    @Test
    public void test(){
        MyCallable mc1 = new MyCallable("mc1");
        MyCallable mc2 = new MyCallable("mc2");
        FutureTask<String> task1 = new FutureTask<String>(mc1);
        FutureTask<String> task2 = new FutureTask<String>(mc2);
        new Thread(task1).start();
        new Thread(task2).start();
        try {
            System.out.println(task1.get());
            System.out.println(task2.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
