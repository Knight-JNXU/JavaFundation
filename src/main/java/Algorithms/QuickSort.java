package Algorithms;

import until.CommonUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/9.
 * 快速排序
 * 时间复杂度：最优和平均情况下是O(nlogn)，最坏情况下是O(n^2)
 * 空间复杂度：最优情况下是O(logn)，最坏情况下是O(n)
 * input demo:
 * 1 3 4 2 0
 */
public class QuickSort {

    private static int[] array;

    public static void main(String[] args){
        CommonUtil.print("快速排序：");
        CommonUtil.print("输入一个数组，用空格分隔：");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String strs[] = inputStr.split(" ");
        int len = strs.length;
        array = new int[len];
        for(int i=0; i<len; i++){
            array[i] = Integer.parseInt(strs[i]);
        }
        quickSort(0, len-1);
        CommonUtil.print("排序后的数组为：");
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int left, int right){
        int originL = left, originR = right;
        int st = array[left];  //选最左边为基准，这时要先从右边开始找
        while (left < right){
            while (array[right]>=st && left<right){
                right--;
            }
            while (array[left]<=st && left<right){
                left++;
            }
            if(left < right){
                swap(left, right);
            }
        }
        swap(originL, left);
        if(left>originL){
            quickSort(originL, left-1);
        }
        if(originR>right){
            quickSort(right+1, originR);
        }
    }

    private static void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
