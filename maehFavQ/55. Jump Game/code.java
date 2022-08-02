class Solution {
    public boolean canJump(int[] nums) 
    {
      
      int jumpingIndex = nums.length-1;
      
      for(int i = nums.length-1; i>=0; i--)
      {
        if(nums[i]+i >= jumpingIndex)
          jumpingIndex = i;
      }
      
      return jumpingIndex == 0;
        
    }
}