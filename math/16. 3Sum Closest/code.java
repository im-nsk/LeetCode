class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length -1];
        Arrays.sort(nums);
        
        for(int i = 0; i< nums.length - 2; i++)
        {
            int a_point = i+1;
            int b_point = nums.length-1;
            
            while(a_point < b_point)
            {
                int curr_sum = nums[i] + nums[a_point] + nums[b_point];
                if(curr_sum < target)
                    a_point++;
                else
                    b_point--;
                
                if(Math.abs(curr_sum - target) < Math.abs(result - target))
                    result = curr_sum;
            }
        }
        return result;
    }
}