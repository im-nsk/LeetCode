Explanation: No need to traverse till last node to find the length: Instead of this: take two pointer, traverse one pointer n+1 because when we reach 
             then nth node from last, then after traversing nth time we can reach to null value. I hope you are getting point. 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummyHead = new ListNode(0);
      dummyHead.next = head;
      ListNode fast = dummyHead;
      ListNode slow = dummyHead;
      
      //This traversing will maintain distance between n+1 , it means fast pointer will reach to null then slow pointer will be before the nth node from last
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
