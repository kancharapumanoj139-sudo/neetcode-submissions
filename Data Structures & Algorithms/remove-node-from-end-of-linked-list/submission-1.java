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
        int c=0;
        if(head.next==null)  return null;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(n>c) return null;
        int target=(c-n+1);
        if(target==1) return head.next;
        temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            if(target==1)
            {
                prev.next=temp.next;
                break;
            }
            target--;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
