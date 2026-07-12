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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ListNode next = (curr == null) ? null : curr.next;
        ListNode evenStart = next;

        while(curr != null && curr.next != null && next != null && next.next != null){
            curr.next = next.next;
            curr = curr.next;
            next.next = curr.next;
            next = next.next;

        }
        if(curr != null){
            curr.next = evenStart;
        }
        return head;
    }
    // 
    /*
    curr.next = next.next;
    next.next = curr.next;
    till 

    1,2,3,4,5
    c,n,c
     */
}