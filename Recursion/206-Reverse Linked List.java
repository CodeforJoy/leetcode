/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
         if(head==null||head.next==null)
            return head;
        ListNode tmp=head.next;
        ListNode ww=null;
        head.next=null;
        ww=reverseList(tmp);
        ListNode cur=ww;
        while(ww.next!=null){
            ww=ww.next;
        }
        ww.next=head;
        return cur;
        
    }
}