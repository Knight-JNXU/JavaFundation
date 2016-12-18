package practice;

import java.util.Scanner;

/**
 * Created by Knigh on 2016/12/18.
 */
public class TouTiao1 {
    private static int times = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String inputStr = sc.nextLine();
            String[] strs = inputStr.split(" ");
            int n = Integer.parseInt(strs[0]);
            int m = Integer.parseInt(strs[1]);
            int k = Integer.parseInt(strs[2]);
            int arr[][] = new int[k][n+1];
            for(int i=0; i<k; i++){
                inputStr = sc.nextLine();
                strs = inputStr.split(" ");
                for(int j=0; j<n; j++){
                    arr[i][j]=Integer.parseInt(strs[j]);
                }
                arr[i][n]=0;
            }
            times=0;
            cal(arr, k, n, 0, 0, m);
            System.out.println(times);
        }
    }
    private static void cal(int[][]arr, int k, int n, int row, int sum, int m){
        if(row<k){
            for(int i=0; i<n; i++){
                cal(arr, k, n, row+1, sum+arr[row][i], m);
            }
        }else{
            if(sum>m){
                times++;
            }
        }
    }
}
