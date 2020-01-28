/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
         if(head==null ||head.next==null)
            return head;
        ListNode tmp=head.next;
        ListNode ww=tmp.next;
        tmp.next=head;
        head.next=swapPairs(ww);
        return tmp;
        
    }
}