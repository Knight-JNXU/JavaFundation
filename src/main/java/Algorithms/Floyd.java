package Algorithms;

import until.CommonUtil;

/**
 * Created by Knight_JXNU on 2016/11/10.
 * floyd算法(弗洛伊德算法)
 * input demo:
 0 10 1 3
 10 0 100 4
 1 100 0 1
 3 4 1 0
 end
 */
public class Floyd {
    public static void main(String[] args){
        CommonUtil.println("请输入邻接方阵：");
        int matrix[][] = CommonUtil.inputIntMatrix();
        int k, i, j;
        for(k=0; k<matrix.length; k++){
            for(i=0; i<matrix.length; i++){
                for(j=0; j<matrix.length; j++){
                    if((matrix[i][k]+matrix[k][j]) < matrix[i][j]){
                        matrix[i][j] = (matrix[i][k]+matrix[k][j]);
                    }
                }
            }
        }
        CommonUtil.println("after floyd:");
        CommonUtil.printIntMat(matrix);
    }
}
