package code0;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Knight_JXNU on 2016/11/4.
 * string to date
 */
public class String2Date {

    @Test
    public void test(){
        try {
            //注意 MM 不能小写
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date0 = simpleDateFormat.parse("2016-11-4");
            System.out.println(date0);
            //由于4月没有31号，会自动跳到5月1号
            Date date1 = simpleDateFormat.parse("2017-4-31");
            System.out.println(date1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
