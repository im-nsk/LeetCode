class Solution {
    public ListNode reverseList(ListNode head) 
    {
      ListNode prevNode = null;
      ListNode nextNode = null;
      ListNode currNode = head;
      
      while(currNode != null)
      {
        nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
      }
      head = prevNode;
      return head; 
    }
}