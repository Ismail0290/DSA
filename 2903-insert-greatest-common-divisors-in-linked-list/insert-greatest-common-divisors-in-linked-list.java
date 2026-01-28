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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ans = head;
        ListNode p1;
        ListNode i;
        while(head.next != null){
            p1 = head.next;
            i = new ListNode(gcd(p1.val, head.val));
            head.next = i;
            i.next = p1;
            head = p1;
        } 
        return ans;  
    }
    static int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}