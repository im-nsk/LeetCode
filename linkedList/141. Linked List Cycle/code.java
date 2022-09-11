Explanation:
If we take one slow nd one fast pointer & one will be faster than another then if cycle existing, difinitely it will at some point.
    example: On one circle ground track, two player are running, one is faster than another then difinitely faster one will be crossed slower one, 
             just imagine this scenario, surely, you will understand.

public class Solution {
    public boolean hasCycle(ListNode head) {
      
      if(head == null) return false;
      
      ListNode slow = head;
      ListNode fast = head.next;
      
      while(slow != fast)
      {
        if(fast == null || fast.next == null) return false;
        slow = slow.next;
        fast = fast.next.next;
      }
      
      return true;
        
    }
}
