class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int maxLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            
            while(sum >= target)
            {
                maxLen = Math.min(maxLen, i + 1 - left);
                sum -= nums[left];
                left++;
            }
        }
        return (maxLen == Integer.MAX_VALUE) ? 0 : maxLen ;
    }
}