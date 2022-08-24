class Solution {
    public int maxSubArray(int[] nums) {
      
      int maxValue = nums[0];
      int curValue = nums[0];
      
      for(int i = 1; i<nums.length; i++)
      {
        curValue = curValue + nums[i] > nums[i] ? curValue + nums[i] : nums[i];
        maxValue = Math.max(maxValue, curValue);
      }
      
      return maxValue;
        
    }
}