class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-2; i++){
            
            int j = i+1;
            int k = nums.length-1;
            
            while(j < k){
                int currSum = nums[i] + nums[j] + nums[k];
                
                if(currSum > target)
                    k--;
                else
                    j++;
                
                if(Math.abs(currSum - target) < Math.abs(result - target))
                    result = currSum;
            }
        }
        
        return result;
        
    }
}