package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Knigh on 2016/12/18.
 */
public class TouTiao2 {
    private static ArrayList<Integer> changeList;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String inputStr = sc.nextLine();
            int n = Integer.parseInt(inputStr);
            char[][] chs = new char[n][2];
            for(int i=0; i<n; i++){
                inputStr = sc.nextLine();
                chs[i][0]=inputStr.charAt(0);
                chs[i][1]=inputStr.charAt(inputStr.length()-1);
            }
            changeList = new ArrayList<Integer>();
            sortOrder(chs, null, 0, n, 0);
            if(changeList.size()==0){
                System.out.println(-1);
            }else{
                Collections.sort(changeList);
                System.out.println(changeList.get(0));
            }
        }
    }
    private static void sortOrder(char[][] chs, ArrayList<Integer> list, int row, int n, int changeTimes){
        if(row>0){
            if(row<n){
                for(int i=0; i<2; i++){
                    if(chs[row-1][list.get(list.size()-1)]<=chs[row][i]){
                        list.add(i);
                        if(i==1){
                            sortOrder(chs, list, row+1, n, changeTimes+1);
                        }else{
                            sortOrder(chs, list, row+1, n, changeTimes);
                        }
                    }
                }
            }else{
                changeList.add(changeTimes);
            }
        }else{
            for(int i=0; i<2; i++){
                ArrayList temp = new ArrayList<Integer>();
                temp.add(i);
                if(i==1){
                    sortOrder(chs, temp, row+1, n, changeTimes+1);
                }else{
                    sortOrder(chs, temp, row+1, n, changeTimes);
                }
            }
        }
    }
}
