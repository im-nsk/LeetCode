class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0;
        int maxSum = 0, sum = 0;
        
        while(j< nums.length){
            if(j - i + 1 <= k){
                sum += nums[j++];
                maxSum = sum;
            }
            else{
                sum += nums[j++];
                sum -= nums[i++];
                maxSum = Math.max(maxSum, sum); 
            }
        }
        return (maxSum * 1.0) / k;
    }
}