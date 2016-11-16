package code0;

/**
 * Created by Knight_JXNU on 2016/11/15.
 * 比较 已定义int 和 Array length 的访问效率区别
 */
public class CompEfficiArrLen {

    public static void main(String[] args){
        int tryTime = 10;
        int array[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int len = array.length;
        int max = 100000000;
        long start1, end1;
        long start2, end2;
        int j;
        for(int n=0; n<tryTime; n++){

            start2 = System.currentTimeMillis();
            for(int i=0; i<max; i++){
                j = 0;
                while(j < array.length){
                    j++;
                }
            }
            end2 = System.currentTimeMillis();

            start1 = System.currentTimeMillis();
            for(int i=0; i<max; i++){
                j = 0;
                while(j < len){
                    j++;
                }
            }
            end1 = System.currentTimeMillis();
            /*start1 = System.currentTimeMillis();
            for(int i=0; i<max; i++){
                j = 0;
                while(j < len){
                    j++;
                }
            }
            end1 = System.currentTimeMillis();

            start2 = System.currentTimeMillis();
            for(int i=0; i<max; i++){
                j = 0;
                while(j < array.length){
                    j++;
                }
            }
            end2 = System.currentTimeMillis();*/
            System.out.println("end1-start1:" + (end1-start1));
            System.out.println("end2-start2:" + (end2-start2));
        }
    }
}
