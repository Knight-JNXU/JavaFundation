package until;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/8.
 */
public class CommonUtil {
    /**
     * 统一带换行的输出方法
     * -.-怎么觉得有点矫情
     * @param str
     */
    public static void println(String str){
        System.out.println(str);
    }

    /**
     * 统一的带空格的输出方法
     * @param str
     */
    public static void printWithSpa(Object str){
        System.out.print(str + " ");
    }

    /**
     * 封装了一个输入整形数组的方法
     * 使用空格分隔元素
     * @return
     */
    public static int[] inputIntArr(){
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String strs[] = inputStr.split(" ");
        int array[] = new int[strs.length];
        int len = strs.length;
        for(int i=0; i<len; i++){
            array[i] = Integer.parseInt(strs[i]);
        }
        return array;
    }

    /**
     * 把一行字符串转换成征信数组
     * @param str
     * @return
     */
    public static int[] line2IntArr(String str){
        String strs[] = str.split(" ");
        int array[] = new int[strs.length];
        int len = strs.length;
        for(int i=0; i<len; i++){
            array[i] = Integer.parseInt(strs[i]);
        }
        return array;
    }

    /**
     * 输入一个int
     * @return
     */
    public static int inputInt(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    /**
     * 统一输入矩阵
     * @return
     */
    public static int[][] inputIntMatrix(){
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<int[]>();
        String inputStr;
        while (sc.hasNextLine() && !(inputStr=sc.nextLine()).equals("end")){
            list.add(line2IntArr(inputStr));
        }
        int rowN = list.size();
        int columnN = list.get(0).length;
        int matrix[][] = new int[rowN][columnN];
        for(int i=0; i<rowN; i++){
            for(int j=0; j<columnN; j++){
                matrix[i][j] = list.get(i)[j];
            }
        }
        return matrix;
    }

    /**
     * 统一输出整形矩阵
     * @param matrix
     */
    public static void printIntMat(int matrix[][]){
        int rowN = matrix.length;
        int columnN = matrix[0].length;
        for(int i=0; i<rowN; i++){
            for(int j=0; j<columnN; j++){
                CommonUtil.printWithSpa(matrix[i][j]);
            }
            CommonUtil.println("");
        }
    }
}
