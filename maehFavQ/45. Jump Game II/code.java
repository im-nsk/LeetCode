class Solution {
    public int jump(int[] nums) 
    {
      int jump = 0;
      int lastJump = 0;
      int step = 0;
      
      for(int i = 0; i<nums.length && jump>=i ; i++)
      {
        if(lastJump < i)
        {
          step++;
          lastJump = jump;
        }
        jump = Math.max(jump,nums[i]+i);
      }
        if(jump < nums.length-1)return 0;
      return step;
    }
}