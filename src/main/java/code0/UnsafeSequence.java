package code0;

/**
 * Created by Knight_JXNU on 2016/11/7.
 */
public class UnsafeSequence {

    private int value;

    public UnsafeSequence(int value) {
        this.value = value;
    }

    public int getValue() {
        return value++;
    }

    private static class MyRunnable implements Runnable{
        private final UnsafeSequence seq;

        public MyRunnable(UnsafeSequence seq) {
            this.seq = seq;
        }

        public void run() {
            try {
                Thread.sleep(100);
                for (int i=0; i<1000; i++){
                    System.out.println(Thread.currentThread().getName()+":"+seq.getValue());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    // warm up MyRunnable.run(), make sure MyRunnable.run() is JIT compiled
    private static void warmUp(){
        UnsafeSequence unsafeSequence = new UnsafeSequence(0);
        MyRunnable r = new MyRunnable(unsafeSequence);
        // warm up MyRunnable.run()
        for(int i=0; i<100; i++){
            r.run();
        }
    }

    public static void main(String[] args){
        warmUp();
        UnsafeSequence unsafeSequence = new UnsafeSequence(0);
        MyRunnable r = new MyRunnable(unsafeSequence);
        for (int i=0; i<5000; i++){
            new Thread(r).start();
        }
    }

}
