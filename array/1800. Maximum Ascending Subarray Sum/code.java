class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int maxSum = nums[0];
        int sum = nums[0];
        
        for(int i = 1, j = 0; i < nums.length; i++,j++)
        {
            if(nums[i] > nums[j])
                sum += nums[i];
            else
                sum = nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}