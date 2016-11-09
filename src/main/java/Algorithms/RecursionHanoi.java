package Algorithms;

import until.CommonUtil;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/9.
 * 递归-从汉诺塔问题出发看递归
 * 汉诺塔问题理解：
 * step 1： n-1个圆盘从 a 移动到 b
 * step 2： 1 个圆盘从 a 移动到 c
 * step 3： n-1 个圆盘从 b 移动到 c
 */
public class RecursionHanoi {

    public static void main(String[] args){
        CommonUtil.print("请输入盘子数量：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        move(n, "A", "B", "C");
        CommonUtil.print("end!");
    }

    private static void move(int n, String a, String b, String c){
        //汉诺塔问题的递归出口
        if(n == 1){
            CommonUtil.print(a+" -> "+c);
        }else{
            move(n-1, a, c, b);
            CommonUtil.print(a+" -> "+c);
            move(n-1, b, a, c);
        }
    }
}
