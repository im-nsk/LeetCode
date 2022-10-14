https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode p = head;
        int lenLinkedList = 0;
        while(p != null)
        {
            lenLinkedList++;
            p = p.next;
        }
        int mid = lenLinkedList/2;
        p = head;
        while(p != null && mid > 1)
        {
            p = p.next;
            mid--;
        }
        p.next = p.next.next;
        return head;
    }
}
