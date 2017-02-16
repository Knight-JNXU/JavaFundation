package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2017/1/16.
 * 探究Thread join的作用
 * result：
 * my thread
 * AtomicType thread
 * 分析：join会把子线程加入到主线程之前执行，只有在子线程执行完了，主线程才能继续执行
 */
public class ThreadJoin {
    private class MyThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(5000);
                System.out.println("my thread");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test(){
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("AtomicType thread");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
