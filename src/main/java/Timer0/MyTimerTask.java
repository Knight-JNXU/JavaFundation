package Timer0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.TimerTask;

/**
 * Created by Knight_JXNU on 2017/1/5.
 */
public class MyTimerTask extends TimerTask{
    private Object targetObject;
    private Method targetMethod;

    public MyTimerTask(Method targetMethod) {
        this.targetMethod = targetMethod;
    }

    public void run() {
        try {
            targetMethod.invoke(null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception{
        MyTimerTask myTimerTask = new MyTimerTask(new TargetClass().getClass().getDeclaredMethod("targetMethod"));
        myTimerTask.run();
    }
}
