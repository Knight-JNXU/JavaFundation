package Algorithms;

import until.OutputUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/8.
 * 冒泡排序(没有优化的)
 * 时间复杂度:O(n^2)
 * demo input:
 * 3 2 5 7 1
 */
public class BubbleSort {
    public static void main(String[] args){
        OutputUtil.print("冒泡排序：");
        OutputUtil.print("输入一个数组，用空格分隔：");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String strs[] = inputStr.split(" ");
        int array[] = new int[strs.length];
        for(int i=0; i<strs.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }
        for(int i=0; i<strs.length-1; i++){
            for(int j=i+1; j<strs.length; j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        OutputUtil.print("从小到大排序后");
        OutputUtil.print(Arrays.toString(array));
    }
}
