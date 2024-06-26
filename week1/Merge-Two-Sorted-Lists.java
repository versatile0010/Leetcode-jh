/**
        - https://leetcode.com/problems/merge-two-sorted-lists/
        - O(n+m) ; when length of list1 = n, length of list2 = m 
        - easy
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 != null) {
            cur.next = list1;
        }
        if(list2 != null) {
            cur.next = list2;
        }
        return head.next;
    }
}
