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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp= head;
        int count=0;
        if(temp.next==null){
            return null;
        }
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
         
        count=(int)Math.ceil(count/2.0);
  
        count--;
        int i=0;
        temp= head;
        while(i<count){
            i++;
            temp=temp.next;
        }
       
        temp.next=temp.next.next;
    
        return head;
        
    }
}