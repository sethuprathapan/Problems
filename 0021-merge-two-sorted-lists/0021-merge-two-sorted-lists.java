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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null;
        ListNode temp= null;
        int i=0;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                if(head==null){
                    head=list1;
                    temp=head;
                    
                    list1=list1.next;

                }else{
                    temp.next=list1;
                    temp=temp.next;
                    list1=list1.next;

                }

            }else{
                if(head==null){
                    head=list2;
                    temp=head;
                    list2=list2.next;
                    

                }else{
                    temp.next=list2;
                    list2=list2.next;
                    temp=temp.next;

                }

            }
            
          


        }
        //hooooo
          while(list1!=null){
                if(head==null){
                    head=list1;
                    temp=head;
                    
                    list1=list1.next;

                }else{
                    temp.next=list1;
                    temp=temp.next;
                    list1=list1.next;

                }

            }
            while(list2!=null){
                 if(head==null){
                    head=list2;
                    temp=head;
                    list2=list2.next;
                    

                }else{
                    temp.next=list2;
                    list2=list2.next;
                    temp=temp.next;

                }

            }
        
        
        
        
        return head;

        
    }
}