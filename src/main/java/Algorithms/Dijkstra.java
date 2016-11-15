package Algorithms;

import until.CommonUtil;

/**
 * Created by Knight_JXNU on 2016/11/10.
 * Dijkstra算法（地杰斯特拉最短路径算法）
 * 适合指定起点的最短路求解(这里把起点设为0)
 */
public class Dijkstra {
    public static void main(String[] args){
        CommonUtil.println("请输入邻接矩阵：");
        int matrix[][] = CommonUtil.inputIntMatrix();
        int minDistance[] = new int[matrix.length];
        int p = 1;
        minDistance[0] = matrix[0][0];
//        for()
    }
}
