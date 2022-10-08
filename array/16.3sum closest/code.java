class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // add the summation of first, second nd last....
        int result = nums[0] + nums[1] + nums[nums.length-1];
        // sort the array:
        Arrays.sort(nums);
        
        // traverse the array len-2:
        for(int i = 0; i < nums.length-2; i++){
            
            // j value should be i+1:
            int j = i+1;
            // k value should be last index:
            int k = nums.length-1;
            
            // iterate the loop, till j should be less than k:
            while(j < k){
                // add the summation of first, second nd last....
                int currSum = nums[i] + nums[j] + nums[k];
                
                // 
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
