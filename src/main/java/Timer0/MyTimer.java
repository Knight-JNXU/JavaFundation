package Timer0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Knight_JXNU on 2017/1/5.
 */
public class MyTimer {
    public static void main(String[] args) throws Exception{
        TimerTask timerTask = new TimerTask() {
            TargetClass targetClass = new TargetClass();
            @Override
            public void run() {
                System.out.println("start time:" + new Date());
                targetClass.targetMethod();
            }
        };
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = dateFormat.parse("2017-1-05 09:59:00");
        long oneDay = 1000 * 60 * 60 * 24;
        long oneMinute = 1000 * 60;
        new Timer().schedule(timerTask, firstTime, oneMinute);
    }
}
