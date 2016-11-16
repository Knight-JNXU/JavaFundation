package Algorithms;

import until.CommonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/11/10.
 * Dijkstra算法（地杰斯特拉最短路径算法）
 * 适合指定起点的最短路求解(这里把起点设为0)
 * input demo:
 */
/*
0 1 5 0 0 0 0 0 0
1 0 3 7 5 0 0 0 0
5 3 0 0 1 7 0 0 0
0 7 0 0 2 0 3 0 0
0 5 1 2 0 3 6 9 0
0 0 7 0 3 0 0 5 0
0 0 0 3 6 0 0 2 7
0 0 0 0 9 5 2 0 4
0 0 0 0 0 0 7 4 0
end
*/
public class Dijkstra {
    public static void main(String[] args){
        CommonUtil.println("请输入邻接矩阵：");
        int matrix[][] = CommonUtil.inputIntMatrix();
        int minDistance[][] = new int[matrix.length][matrix.length];
        int from = 0; //当前所在的点，设置初始点为0，这里是求0到所有点的最短距离
        List<Integer> findedList = new ArrayList<Integer>();  //已近加入点list
        findedList.add(from);
        int minDistan;
        int to;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while (findedList.size() < matrix.length){
            minDistan = Integer.MAX_VALUE;
            to = -1;
            for(Integer item : findedList){
                for(int i=0; i<matrix.length; i++){
                    if(matrix[item][i]<minDistan && !findedList.contains(i)){
                        to = i;
                        minDistan = matrix[item][i];
                        from = item;
                    }
                }
            }
            matrix[from][to] = Integer.MAX_VALUE;
            matrix[to][from] = Integer.MAX_VALUE;
            CommonUtil.println(from+" -> "+to);
            minDistance[from][to] = minDistan;
            findedList.add(to);
            from = to;
        }
        //矩阵值为0表示弃用的路线
        CommonUtil.printIntMat(minDistance);
    }
}
