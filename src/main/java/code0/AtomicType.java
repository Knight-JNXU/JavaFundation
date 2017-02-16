package code0;

import org.junit.Test;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Knight_JXNU on 2017/2/16.
 * 探究atomicXXX是否是线程安全的
 * 分析：是线程安全的
 */
public class AtomicType {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int integer = 0;
    private int addValue = 1;
    private int loopTimes = 100;
    private long sleepTime = 100;

    @Test
    public void test0(){
        atomicInteger = new AtomicInteger(0);
        for(int i=0; i<loopTimes; i++){
            new MyThread0().start();
        }
    }
    @Test
    public void test1(){
        integer = 0;
        MyThread1 myThread1 = new MyThread1();
        for(int i=0; i<loopTimes; i++){
            new MyThread1().start();
        }
    }
    @Test
    public void isInOrder(){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[loopTimes];
        int count = 0;
        while (sc.hasNext()){
            array[count++] = Integer.parseInt(sc.nextLine());
        }
        for(int i=1; i<loopTimes; i++){
            if(array[i]-array[i-1]!=1){
                System.out.println("false");
                break;
            }
        }
    }


    private class MyThread0 extends Thread{
        @Override
        public void run() {
            atomicInteger = new AtomicInteger(atomicInteger.addAndGet(addValue));
            System.out.println(atomicInteger);
            try {
                this.sleep(sleepTime);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private class MyThread1 extends Thread{
        @Override
        public void run() {
            integer += addValue;
            System.out.println(integer);
            try {
                this.sleep(sleepTime);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
