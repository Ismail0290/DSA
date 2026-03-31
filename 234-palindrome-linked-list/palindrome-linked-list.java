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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode f = head;
        ListNode s = head;
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }
        s.next = reverse(s.next);
        ListNode first = head;
        ListNode second = s.next;
        while(second != null){
            if(first.val != second.val) {
                s.next = reverse(s.next);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        s.next = reverse(s.next);
        return true;
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}