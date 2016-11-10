package DataStructures;

import until.CommonUtil;

/**
 * Created by Knight_JXNU on 2016/11/9.
 * 二叉树的创建、前序、中序、后序遍历
 * 参考资料：
 * http://www.tuicool.com/articles/Nz2Ebuz
 * http://blog.csdn.net/cxxsoft/article/details/935410
 * input demo
 * 1
 * 1 2 3 4 5
 * 1
 * 4
 */
public class BinaryTree {

    private static int headValue = -1;  //头结点值
    private static int arrayPoint = 0;  //数组指针

    private static class Node{
        public int value;
        public Node leftChild=null;
        public Node rightChild=null;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args){
        CommonUtil.println("请输入创建二叉树的方式：");
        CommonUtil.println("1.createTree1");
        CommonUtil.println("2.createTree2");
        int chooice = CommonUtil.inputInt();
        CommonUtil.println("请输入一颗二叉树，使用空格分隔：");
        int array[] = CommonUtil.inputIntArr();
        Node head = null;
        switch (chooice){
            case 1:
                head = createTree1(array, 0, array.length);
                break;
            case 2:
                head = createTree2(array, 0, array.length);
                break;
            default:
                CommonUtil.println("非法输入");
                break;
        }
        boolean continueFlag = true;
        CommonUtil.println("请输入遍历类型：");
        CommonUtil.println("1.前序");
        CommonUtil.println("2.中序");
        CommonUtil.println("3.后序");
        CommonUtil.println("4.结束");
        while (continueFlag){
            chooice = CommonUtil.inputInt();
            switch (chooice){
                case 1:
                    dpreOrderAccess(head);
                    CommonUtil.println("");
                    break;
                case 2:
                    dmidOrderAccess(head);
                    CommonUtil.println("");
                    break;
                case 3:
                    dlastOrderAccess(head);
                    CommonUtil.println("");
                    break;
                case 4:
                    continueFlag = false;
                    break;
                default:
                    CommonUtil.println("非法输入！");
                    break;
            }
        }
    }

    /**
     * 使用递归创建二叉树方法一
     * @param array
     * @param i
     * @param len
     * @return
     */
    private static Node createTree1(int[] array, int i, int len){
        if(i >= len){
            return null;
        }else{
            Node node = new Node(array[i]);
            node.leftChild = createTree1(array, i*2+1, len);
            node.rightChild = createTree1(array, i*2+2, len);
            return node;
        }
    }

    /**
     * 使用递归创建二叉树方法二
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static Node createTree2(int[] array, double start, double end){
        if(start > end){
            return null;
        }else{
            Node node = new Node((int)Math.rint((start+end)/2));
            node.leftChild = createTree2(array, start, (int)Math.rint((start+end)/2)-1);
            node.rightChild = createTree2(array, (int)Math.rint((start+end)/2)+1, end);
            return node;
        }
    }

    /**
     * 前序遍历
     * @param head
     */
    private static void dpreOrderAccess(Node head){
        if(head != null){
            CommonUtil.printWithSpa(head.value);
            dpreOrderAccess(head.leftChild);
            dpreOrderAccess(head.rightChild);
        }
    }

    /**
     * 中序遍历
     * @param head
     */
    private static void dmidOrderAccess(Node head){
        if(head != null){
            dmidOrderAccess(head.leftChild);
            CommonUtil.printWithSpa(head.value);
            dmidOrderAccess(head.rightChild);
        }
    }

    /**
     * 后序遍历
     * @param head
     */
    private static void dlastOrderAccess(Node head){
        if(head != null){
            dlastOrderAccess(head.leftChild);
            dlastOrderAccess(head.rightChild);
            CommonUtil.printWithSpa(head.value);
        }
    }
}
