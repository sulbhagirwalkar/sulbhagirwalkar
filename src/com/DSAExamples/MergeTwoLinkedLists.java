package com.DSAExamples;
// Definition for singly linked list
class ListNode{
int val;
ListNode next;
ListNode(int x){
val = x;}
}

public class MergeTwoLinkedLists {
    public static ListNode mergeList(ListNode l1, ListNode l2){

        ListNode temp_node = new ListNode(0);

        ListNode current_node = temp_node;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current_node.next = l1;
                l1 = l1.next;
            } else {
                current_node.next = l2;
                l2 = l2.next;
            }
        }
        return temp_node.next;
    }
    public static void main(String[] args) {


    }
}

