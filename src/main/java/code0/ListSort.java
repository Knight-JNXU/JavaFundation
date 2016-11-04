package code0;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Knight_JXNU on 2016/10/12.
 * 使用 comparator 进行 list 排序
 */
public class ListSort {
    private class MyComparator implements Comparator<Integer>{

        public int compare(Integer o1, Integer o2) {
            if(o1 < o2){
                return 1;
            }else{
                if(o1 > o2){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }


    @org.junit.Test
    public void test(){
        int a[] = {1, 5, 8, 3, 6 ,4};
        System.out.println("before sort:");
        printArray(a);
        // 基本数据类型只能实现 从小到大 的排序
        Arrays.sort(a);
        System.out.println("after sort:");
        printArray(a);

        System.out.println("----------------");

        int a3[] = {8, 1, 3, 6, 4};
        System.out.println("before sort:");
        printArray(a3);
        Arrays.sort(a3, 0, 2);  //部分排序，下标从 0 到 2(不包括2) 进行排序
        System.out.println("after sort:");
        printArray(a3);

        System.out.println("----------------");

        Integer a2[] = {1, 5 ,3 ,2 ,9};
        System.out.println("before sort:");
        printArray2(a2);
        Comparator cmp = new MyComparator();
        Arrays.sort(a2, cmp);
        System.out.println("before sort:");
        printArray2(a2);
    }

    public void printArray(int a[]){
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public void printArray2(Integer a[]){
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
