package Algorithms;

import until.CommonUtil;

import java.util.Arrays;

/**
 * Created by Knight_JXNU on 2016/11/10.
 * 选择排序
 * 参考资料：http://bubkoo.com/2014/01/13/sort-algorithm/selection-sort/
 * 时间复杂度：平均、最好、最坏O(n^2)
 * 空间复杂度：O(1)
 */
public class SelectionSort {
    public static void main(String[] args){
        CommonUtil.println("请输入一个数组（用空格分隔）：");
        int array[] = CommonUtil.inputIntArr();
        int len = array.length;
        int min;
        for(int i=0; i<len-1; i++){
            min = i;
            for(int j=i+1; j<len; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        CommonUtil.println("排序后");
        System.out.print(Arrays.toString(array));
    }
}
