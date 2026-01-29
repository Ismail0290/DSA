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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;
        if(head.next.next == null){
            head.next.next = head;
            ListNode ans = head.next;
            head.next = null; 
            return ans;
        }
        ListNode center = head.next;
        ListNode right = head.next.next;
        head.next = null;
        ListNode left = head;
        while(right != null){
            center.next = left;
            left = center;
            center = right;
            if(right.next == null){
                right = null;
            }else right = right.next;   
        }
        center.next = left;
        return center;
    }
}