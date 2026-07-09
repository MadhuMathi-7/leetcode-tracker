// Last updated: 7/9/2026, 9:52:42 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(k == 1){
            return head ;
        }
        int size = 0 ;
        ListNode temp = head ;

        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return helper(head , size , k);

    }
    ListNode helper(ListNode h  , int size , int k){
        if(size/k == 0){
            return h ;
        }
        int i = k;
        ListNode temp = h ;
        ListNode  curr = h.next ;
        ListNode third = h.next ;
        while(i>2 ){
            third = curr.next ;
            curr.next = temp ;
            temp = curr ;
            curr = third ;
            i--;
        }
        third = third.next ;
        curr.next = temp ;
        h.next = helper(third , size - k , k );
        return curr;

    }
}