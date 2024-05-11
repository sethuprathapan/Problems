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
    public int pairSum(ListNode head) {
        ListNode fast,slow,prev=null;
        
        fast=head;
        slow=head;
        int max=0;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode nextnode=null;
        while(slow!=null){
            nextnode=slow.next;
            slow.next=prev;
              
            prev=slow;
            
            slow=nextnode;



        }
        
        while(prev!=null){
            int val=prev.val+head.val;
        if(max<val){
            max=val;
        }
        head=head.next;
        prev=prev.next;

        }

        
        System.out.println(max);
        return max;
    }
}