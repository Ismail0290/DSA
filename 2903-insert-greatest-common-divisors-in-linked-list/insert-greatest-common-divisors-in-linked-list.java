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
    static int gcd(int n1, int n2){
        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);
        int g = 0;
        for(int i = 1; i<=Math.sqrt(min); i++){
            if(min % i == 0){
                if(max % i == 0){
                    g = Math.max(i, g);
                }
                if(min/i != i && max % (min/i) == 0){
                    g = Math.max(min/i, g);
                }
            }
        }
        return g;
    }
}