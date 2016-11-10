package Algorithms;

import until.CommonUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/8.
 * 优化冒泡排序2
 * 时间复杂度：最好是O(1)，最坏是O(n^2)
 * 空间复杂度：O(1)
 * input demo:
 * 1 2 3 4 5 6
 */
public class BubbleSortOp2 {
    public static void main(String[] args){
        CommonUtil.println("冒泡排序：");
        CommonUtil.println("输入一个数组，用空格分隔：");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String strs[] = inputStr.split(" ");
        int array[] = new int[strs.length];
        for(int i=0; i<strs.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }
        int index = strs.length-1;
        while (index > 0){
            for (int i=0; i<strs.length-1; i++){
                int k = index;
                index = 0;
                for(int j=0; j<k; j++){
                    if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        index = j;  //记录无序区的末尾位置
                    }
                }
            }
        }
        CommonUtil.println("从小到大排序后");
        CommonUtil.println(Arrays.toString(array));
    }
}
