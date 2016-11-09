package until;

import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/8.
 */
public class CommonUtil {
    /**
     * 统一输出方法
     * -.-怎么觉得有点矫情
     * @param str
     */
    public static void print(String str){
        System.out.println(str);
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
}
