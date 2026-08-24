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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int count=1;
        if (temp==null) return null;
        while(temp!=null&&temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp.next=head;
        k=k%count;
        for(int i=0;i<count-k;i++){
            head=head.next;
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}