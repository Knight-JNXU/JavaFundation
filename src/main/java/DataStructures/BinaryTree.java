package DataStructures;

import until.CommonUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Knight_JXNU on 2016/11/9.
 * 二叉树的创建、前序、中序、后序遍历
 * 参考资料：http://www.tuicool.com/articles/Nz2Ebuz
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
        CommonUtil.print("请输入一颗二叉树，使用空格分隔：");
        int array[] = CommonUtil.inputIntArr();
//        Node head = createTreeX(null, array, 0, array.length);
//        Node head = createTreeX(null, array, array.length);
        Arrays.sort(array);
//        Node head = createTreeX(null, array, array.length/2, array.length);
        Node head = createTreeX(array, array.length/2, 0, array.length-1);
        int i=1;
    }

    /*private static Node createTreeX(Node node, int array[], int index, int len){
        if(arrayPoint>=len){
            return null;
        }else{
            node = new Node(array[arrayPoint++]);
            if(index+1<len && array[index+1] <= node.value){
                node.leftChild = createTreeX(node.leftChild, array, index+1, len);
            }else{
                if(index+2<len && array[index+2] > node.value){
                    node.rightChild = createTreeX(node.rightChild, array, index+2, len);
                }
            }
            return node;
        }
    }*/
    private static Node createTreeX(int array[], int index, int start, int end){
        if(index>(end-1) || index<(start+1)){
            return null;
        }else{
            Node node = new Node(array[index]);
//            if(index-1>=0){
                CommonUtil.print(""+(index-1));
                node.leftChild = createTreeX(array, index-1, index);
//            }
//            if(index+1<len){
                CommonUtil.print(""+(index+1));
                node.rightChild = createTreeX(array, index+1, len);
//            }
            return node;
        }
    }
    /*private static Node createTreeX(Node node, int array[], int len){
        if(arrayPoint==len){
            return null;
        }else{
            node = new Node(array[arrayPoint++]);
            node.leftChild = createTreeX(node.leftChild, array, len);
            node.rightChild = createTreeX(node.rightChild, array, len);
        }
            return node;
    }*/


}
