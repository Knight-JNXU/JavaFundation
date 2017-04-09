package Algorithms;

import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author knight
 * @createtime : 2017/04/09 16:26
 * @description : 后缀表达式
 * @result :
 */

public class SuffixExpression {

    public static void main(String[] args){
        String inputStr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个中缀表达式(以'='号结尾):");
        inputStr = scanner.nextLine();
        Validate.notNull(inputStr, "inputstr is null!");
        int stackDeep = 100;
        String numStack[] = new String[stackDeep];  //数值栈
        int numStackPointer = 0;  //数值栈指针
        String opStack[] = new String[stackDeep];  //运算符栈
        int opStackPointer = 0;  //运算符栈指针
        inputStr = inputStr.replaceAll(" ", "");
        char inputChars [] = inputStr.toCharArray();

        int result = 0;
        int tempResult;
        String tempNum = "";
        for(char c : inputChars){
            if(isNum(c)){
                tempNum += c;
            }else{
                numStack[numStackPointer++] = tempNum;
                tempNum = "";
                opStack.add(String.valueOf(c));
            }
        }

        System.out.println(String.valueOf('c'));
    }

    /**
     * 判断 char 是不是数字
     * @param c
     * @return
     * true 是数字
     * false 不是数字
     */
    private static boolean isNum(char c){
        Validate.notNull(c, "param c is null");
        if(c>='0' && c<'9'){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 计算
     * @param num1  运算数
     * @param num2  运算数
     * @param op    运算符string
     * @return  运算结果
     */
    private static int calculator(int num1, int num2, String op){
        char opChar = Character.charV
        switch (op){
            case "+":
                return (num1+num2);
        }
    }

}
