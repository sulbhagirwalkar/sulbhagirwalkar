class Node{
    int n;
    Node next;
    public Node(int n){
        this.n = n;
        next = null;
    }
}
public class LeftRotateLinkedList {

    static Node leftRotate(Node head){
        /**
        * left rotate the list once
         * return the head of the rotated list
        */
        if(head == null || head.next == null){
            return null;
        }
        //find the last node
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        Node lastNode = curr;
        //save the new head
        Node next = head.next;
        // disconnect the head
        head.next = null;
        // set the head to next of last node
        lastNode.next = head;
        //return the new head
        return head;
    }
    public static void main(String[] args) {

    }
}
