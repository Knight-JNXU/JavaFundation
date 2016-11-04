package code0;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by Knight_JXNU on 2016/11/3.
 * java bigdecimal 基本用法
 */
public class BaseBigDecimal {

    /**
     * bigdecimal 构造
     */
    @Test
    public void construct(){
        BigDecimal b0 = new BigDecimal(1);
        BigDecimal b1 = new BigDecimal(1.0f);
        BigDecimal b2 = new BigDecimal(1.0);
        BigDecimal b3 = new BigDecimal("3");
    }

    /**
     * bigdecimal 获取 double value
     */
    public void getDoubleValue(){
        BigDecimal b = new BigDecimal("1.23333");
        double d = b.doubleValue();
    }

    /**
     * bigdecimal 加
     */
    @Test
    public void add(){
        BigDecimal b0 = new BigDecimal("1.3");
        BigDecimal b1 = new BigDecimal("0.6");
        BigDecimal result = b0.add(b1);
    }

    /**
     * bigdecimal 减
     */
    @Test
    public void sub(){
        BigDecimal b0 = new BigDecimal("5.663");
        BigDecimal b1 = new BigDecimal("0.669");
        BigDecimal result = b0.subtract(b1);
    }

    /**
     * bigdecimal 乘
     */
    @Test
    public void multiply(){
        BigDecimal b0 = new BigDecimal("1.3723");
        BigDecimal b1 = new BigDecimal("1.4236");
        BigDecimal result = b0.multiply(b1);
    }

    /**
     * bigdecimal 除
     */
    @Test
    public void divide(){
        BigDecimal b0 = new BigDecimal("1.26");
        BigDecimal b1 = new BigDecimal("1.2489");
        BigDecimal result = b0.divide(b1);
    }

    /**
     * bigdecimal 四舍五入
     */
    @Test
    public void round(){
        int len = 2;
        BigDecimal b0 = new BigDecimal("1.26");
        BigDecimal b1 = new BigDecimal("1.2489");
        BigDecimal result = b0.divide(b1, len, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * decimal 保留 n 位小数
     */
    public void nDecimal(){
        DecimalFormat decimalFormat0 = new DecimalFormat("0.00");
        DecimalFormat decimalFormat1 = new DecimalFormat("#.00");
        DecimalFormat decimalFormat2 = new DecimalFormat("%.2f");
        String str0 = decimalFormat0.format(new BigDecimal("2.6"));
        String str1 = decimalFormat1.format(new BigDecimal("2.6"));
        String str2 = decimalFormat2.format(new BigDecimal("2.6"));
    }

}
