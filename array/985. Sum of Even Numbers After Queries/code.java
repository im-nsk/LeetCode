class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for(int val : nums){
            if(val % 2 == 0)sum += val;
        }
        int result[] = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int index = queries[i][1];
            int value = queries[i][0];
            
            if(nums[index] % 2 == 0)
                sum -= nums[index];
            nums[index] += value;
            if(nums[index] % 2 == 0)
                sum += nums[index];
            result[i] = sum;
        }
        return result;
    }
}