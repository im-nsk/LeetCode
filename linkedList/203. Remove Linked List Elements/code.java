class Solution {
    public ListNode removeElements(ListNode head, int val) 
    {
      while(head != null && head.val == val)
      {
        head = head.next;
      }
      
      ListNode newNode = head;
      
      while(newNode != null && newNode.next != null)
      {
        if(newNode.next.val == val)
          newNode.next = newNode.next.next;
        else
          newNode = newNode.next;
      }
      
      return head;
    }
}