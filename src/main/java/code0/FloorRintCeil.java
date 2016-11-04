package code0;

/**
 * Created by Knight_JXNU on 2016/11/3.
 * floor、rint、ceil用法
 */
public class FloorRintCeil {

    @org.junit.Test
    public void test(){
        /**
         *  floor 往一维数轴的左边取最靠近的整数
         */
        System.out.println("Math.floor(3.4) : "+Math.floor(3.4));
        System.out.println("Math.floor(3.5) : "+Math.floor(3.5));
        System.out.println("Math.floor(-3.6) : "+Math.floor(-3.6));
        System.out.println("----------------------");
        /**
         * rint 常规的四舍五入
         */
        System.out.println("Math.rint(3.49) : "+Math.rint(3.49));
        System.out.println("Math.rint(3.5) : "+Math.rint(3.5));
        System.out.println("Math.rint(-3.6) : "+Math.rint(-3.6));
        System.out.println("----------------------");
        /**
         * ceil 往一维数轴的左边取最靠近的整数
         */
        System.out.println("Math.ceil(3.4) : "+Math.ceil(3.4));
        System.out.println("Math.ceil(3.5) : "+Math.ceil(3.5));
        System.out.println("Math.ceil(-3.6) : "+Math.ceil(-3.6));
    }

}
