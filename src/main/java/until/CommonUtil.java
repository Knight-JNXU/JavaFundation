package until;

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
     * 输入一个int
     * @return
     */
    public static int inputInt(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
}
