package Timer0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Knight_JXNU on 2017/1/5.
 */
public class MyTimer2 {
    public static final long ONE_DAY = 1000 * 60 * 60 * 24;
    public static final long ONE_HOUR = 1000 * 60 * 60;
    public static final long ONE_MINUTE = 1000 * 60;
    public static final long ONE_SECONDE = 1000;
    private DateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd ");
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Timer timer = new Timer();
    private Date firstTime;
    private TimerTask timerTask;
    public MyTimer2(String hms, long waitTimer, TargetInterface targetInterface) {
        try {
            timerTask = new TimerTask() {
                TargetClass targetClass = new TargetClass();
                @Override
                public void run() {
                    System.out.println("start time:" + new Date());
                    targetClass.targetMethod();
                }
            };
            firstTime = dateFormat.parse(dayFormat.format(new Date())+hms);
            timer.schedule(timerTask, firstTime, waitTimer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
