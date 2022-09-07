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
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null) 
            return null;
        
        ListNode linkingNode = new ListNode(0);
        linkingNode.next  = head;
        ListNode currNode  = linkingNode;

       while(currNode.next != null && currNode.next.next != null){
           ListNode firstNode = currNode.next;
           ListNode secondNode = currNode.next.next;
           
           firstNode.next = secondNode.next;
           currNode.next = secondNode;
           
           currNode.next.next = firstNode;
           
           currNode = currNode.next.next;
       }
      return linkingNode.next;
        
    }
}