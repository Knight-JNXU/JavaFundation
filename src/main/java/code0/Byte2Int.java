package code0;

/**
 * Created by Knight_JXNU on 2016/10/28.
 * byte 强制类型转换为 int
 */
public class Byte2Int {

    @org.junit.Test
    public void test(){
        int max = 500;
        for(int i=0; i<max; i++){
            // int 强行转 int 会导致经度丢失
            System.out.println(i+" : "+(byte)i);
        }
    }

}
