
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class CheckPalindromeInLinkedList {
   public static boolean isPalindrome(ListNode head){
       if(head == null || head.next == null) {
           return true;
       }
       //1. find the middle using slow/fast pointers
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       //2. Reverse the second half
       ListNode secondHalf = reverse(slow);

       ListNode p1 = head;
       ListNode p2 = secondHalf;

       while(p2 != null){
           if(p1.val != p2.val){
               return false;
           }
           p1 = p1.next;
           p2 = p2.next;
       }

       return true;
   }

    private static ListNode reverse(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;

       while(curr != null){
           ListNode nextTemp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nextTemp;
       }
       return prev;
    }

    public static void main(String[] args) {

    }
}
