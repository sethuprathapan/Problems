/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int carry = 0 ;
        int sum = 0;
        while( l1 != null || l2 != null){
          int a =(l1 != null)?  l1.val  : 0 ;
          int b =(l2 != null)? l2.val  : 0 ;
          sum= a + b + carry;
          temp.next= new ListNode(sum%10);
          carry= sum/10;
           if (l1 != null){
               l1= l1.next;
           }
            if (l2 != null){
               l2= l2.next;
           }
           temp= temp.next;

        }
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
        return (head.next);
    }
}
