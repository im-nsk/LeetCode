class Solution {
  
  public boolean checkPalindrome(ArrayList list, int start, int end)
  {
    if(list.get(start) != list.get(end))return false;
    
    if(start>=end) return true;
    
    return checkPalindrome(list, ++start, --end);
  }
    public boolean isPalindrome(ListNode head) 
    {
      ArrayList<Integer>list = new ArrayList<>();
      
      while(head != null)
      {
        list.add(head.val);
        head = head.next;
      }
      
      return checkPalindrome(list, 0, list.size()-1);
        
    }
}