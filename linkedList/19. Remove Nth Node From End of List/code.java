class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummyHead = new ListNode(0);
      dummyHead.next = head;
      ListNode fast = dummyHead;
      ListNode slow = dummyHead;
      
      for(int i = 1; i <= n+1; i++)
        fast = fast.next;
      
      while(fast != null)
      {
        slow = slow.next;
        fast = fast.next;
      }
      
      slow.next = slow.next.next;
      
      return dummyHead.next;
        
    }
}