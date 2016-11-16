package Algorithms;

import until.CommonUtil;

/**
 * Created by Knight_JXNU on 2016/11/16.
 * 桶排序
 * 时间复杂度：O(n+k)
 * 空间复杂度：O(n+k)
 * input demo:
 * 1 4 5 7 2 3 1
 */
public class BucketSort {
    public static void main(String[] args){
        CommonUtil.println("请输入由0~9组成的数组：");
        int array[] = CommonUtil.inputIntArr();
        int barrel[] = new int[10];
        for(int i=0; i<array.length; i++){
            barrel[array[i]]++;
        }
        for(int i=0; i<barrel.length; i++){
            for(int j=0; j<barrel[i]; j++){
                CommonUtil.printWithSpa(i);
            }
        }
    }
}
