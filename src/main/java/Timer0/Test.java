package Timer0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Knight_JXNU on 2017/1/5.
 */
public class Test {
    public static void main(String[] args){
        DateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd ");
        System.out.println(dayFormat.format(new Date()));
    }
}
