class Solution {
    public int maxProduct(int[] nums) {
      
      int currMin = nums[0];
      int currMax = nums[0];
      int maxValue = nums[0];
      
      for(int i = 1; i < nums.length; i++)
      {
        int n1 = currMin * nums[i];
        int n2 = currMax * nums[i];
        currMax = Math.max(nums[i], Math.max(n1, n2));
        currMin = Math.min(nums[i], Math.min(n1,n2));
                           
        maxValue = Math.max(maxValue, currMax);
      }
     
      return maxValue;
    }
}