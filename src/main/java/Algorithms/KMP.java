package Algorithms;

import until.CommonUtil;

/**
 * Created by Knigh on 2016/11/28.
 * KMP算法
 */
public class KMP {
    public static void main(String[] args){
        CommonUtil.println("请输入目标串：");
        String targetStr = CommonUtil.inputStr();
        char targetCh[] = targetStr.toCharArray();
        CommonUtil.println("请输入模式串：");
        String modelStr = CommonUtil.inputStr();
        char modelCh[] = targetStr.toCharArray();
        int i=0, j=0, k=0;
        while (k<modelCh.length){
            if(k+1<modelCh.length && modelCh[k]==modelCh[k+1]){
                k++;
            }else{
                break;
            }
        }

//        for()
    }
}
