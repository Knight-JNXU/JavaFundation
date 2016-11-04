package code0;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by Knight_JXNU on 2016/11/4.
 * java 编码转换
 */
public class Transcoding {

    @Test
    public void test(){
        try {
            String s1 = "您好！";
            String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");
            //没想到还要catch exception..
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }

}
