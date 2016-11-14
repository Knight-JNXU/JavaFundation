package DataStructures;

import until.CommonUtil;

/**
 * Created by Knight_JXNU on 2016/11/14.
 * 双向链表
 * input demo：
 * 1 2 3 4
 */
public class DoublyLinkedList {
    private static class Node{
        public int value;
        public Node next;
        public Node last;
        public Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args){
        int headValue = -1;
        CommonUtil.println("请输入一个链表（用空格分隔）:");
        int array[] = CommonUtil.inputIntArr();
        Node head = new Node(headValue);
        Node cur = head;
        Node last = null;
        for(int i=0; i<array.length; i++){
            Node next = new Node(array[i]);
            cur.next = next;
            next.last = cur;
            cur = next;
            last = next;
        }
        CommonUtil.println("顺序输出链表：");
        cur = head;
        while (cur != null){
            CommonUtil.printWithSpa(cur.value);
            cur = cur.next;
        }
        CommonUtil.println("");
        CommonUtil.println("倒序输出链表：");
        cur = last;
        while (cur != null){
            CommonUtil.printWithSpa(cur.value);
            cur = cur.last;
        }
    }
}
