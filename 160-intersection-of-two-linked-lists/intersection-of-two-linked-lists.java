/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        boolean change1 = true;
        boolean change2 = true;
        while(p1 != p2){
            if(p1 != null && p1.next != null){
                p1 = p1.next;
            }else if(change1){
                p1 = headB;
                change1 = false;
            }else{
                p1 = null;
            }
            if(p2.next != null){
                p2 = p2.next;
            }else if(change2){
                p2 = headA;
                change2 = false;
            }else{
                p2 = null;
            }
        }
        return p1;
    }
}