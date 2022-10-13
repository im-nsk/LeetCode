//https://leetcode.com/problems/delete-node-in-a-linked-list/

class Solution {
    public void deleteNode(ListNode node) {
    
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = node.next.next;
    }
}