package Algorithms;

import until.OutputUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/8.
 * 优化后的冒泡排序
 * 时间复杂度：最坏情况下的时间复杂度为O(n^2)，最好情况下的时间复杂度为O(n)
 * demo input:
 * 1 2 3 4 5
 */
public class BubbleSortOp1 {
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
        for (int i = 0; i < strs.length - 1; i++) {
            boolean changFlag = false;
            // 在某一趟遍历中,如果没有可交换的,那么swapped = false,跳出外层循环;
            // 如果一旦进行了交换,则swapped = true,需要进行下一趟遍历
            for (int j = strs.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    changFlag = true;
                }
            }
            if(changFlag == false){
                break;
            }
        }
        OutputUtil.print("从小到大排序后");
        OutputUtil.print(Arrays.toString(array));
    }
}
