package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/19.
 * 测试for循环的效率
 * result:
 * 基本上是 for(int i;....) 这种形式的效率更低
 */
public class ForEffic {
    @Test
    public void test(){
        int maxTimes = 1000000;
        int times = 10;
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int r=0;
        long start1, end1;
        long start2, end2;
        for(int tt=0; tt<times; tt++){
            System.out.println("---------------------"+tt+"-----------------------");
            start1 = System.currentTimeMillis();
            for(int t=0; t<maxTimes; t++){
                for(int i=0; i<arr.length; i++){
                    r++;
                }
            }
            end1 = System.currentTimeMillis();
            start2 = System.currentTimeMillis();
            for(int t=0; t<maxTimes; t++){
                for(int item : arr){
                    r++;
                }
            }
            end2 = System.currentTimeMillis();
            System.out.println("end1-start1:" + (end1-start1));
            System.out.println("end2-start2:" + (end2-start2));
            System.out.println("---------------------调换顺序-----------------------");
            start2 = System.currentTimeMillis();
            for(int t=0; t<maxTimes; t++){
                for(int item : arr){
                    r++;
                }
            }
            end2 = System.currentTimeMillis();
            start1 = System.currentTimeMillis();
            for(int t=0; t<maxTimes; t++){
                for(int i=0; i<arr.length; i++){
                    r++;
                }
            }
            end1 = System.currentTimeMillis();
            System.out.println("end1-start1:" + (end1-start1));
            System.out.println("end2-start2:" + (end2-start2));
        }
    }
}
