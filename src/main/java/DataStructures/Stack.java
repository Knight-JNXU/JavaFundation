package DataStructures;

import until.CommonUtil;

/**
 * Created by Knight_JXNU on 2016/11/10.
 * 栈
 */
public class Stack {
    public static void main(String[] args){
        int stackLen = 1000;
        CommonUtil.println("栈");
        CommonUtil.println("1.入栈");
        CommonUtil.println("2.出栈");
        CommonUtil.println("3.栈状态");
        CommonUtil.println("4.结束");
        boolean flag = true;
        int choice;
        int top = 0;  //栈顶指针
        int stack[] = new int[stackLen];
        while (flag){
            CommonUtil.println("pleasae input your choice");
            choice = CommonUtil.inputInt();
            switch (choice){
                case 1:
                    CommonUtil.println("input:");
                    int temp = CommonUtil.inputInt();
                    stack[top++] = temp;
                    CommonUtil.println("input over！");
                    break;
                case 2:
                    CommonUtil.println("out：");
                    CommonUtil.println(""+stack[--top]);
                    CommonUtil.println("out over！");
                    break;
                case 3:
                    CommonUtil.println("all:");
                    for(int i=top-1; i>=0; i--){
                        CommonUtil.println(""+stack[i]);
                    }
                    CommonUtil.println("Over！");
                    break;
                case 4:
                    flag = false;
                    CommonUtil.println("Quit！");
                    break;
                default:
                    CommonUtil.println("非法输入！");
                    break;
            }
        }
    }
}
