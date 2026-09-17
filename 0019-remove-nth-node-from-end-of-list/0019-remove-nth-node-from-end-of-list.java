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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode present = head;
        if(head==null || head.next==null){
            return null;
        }
        int length=0;
        while(present!=null){
            present= present.next;
            length++;
        }
        if(length==n){
            return head.next;
        }
        int temp= length-n;
        present= head;
        for(int i=0;i<temp-1;i++){
            present=present.next;
        }
        ListNode temp1 =present.next;
        if( present.next!=null && present.next.next!=null){
        present.next= present.next.next;
        }
        else{
            present.next=null;
        }
       if(temp1 !=null ){
        temp1.next= null;}
        return head;


    }
}