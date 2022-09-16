class Solution {
    int dp[][];
    private int operation(int []nums, int[] multi, int i, int start){
    // we need to check till last element of multi Array
        if(i == multi.length) return 0;
     // if in dp array any value is updated then return it when it need   
        if(dp[i][start] != 0) return dp[i][start];
     
    // end value, we can set as parameter also  but for that dp will be 3d array, then we will get TLE, so taking end value with the helo of start value.
        int end = nums.length - (i - start) - 1;
     
    // take value from start side or end side    
        int oper1 = multi[i] * nums[start] + operation(nums, multi, i+1, start+1);
        int oper2 = multi[i] * nums[end] + operation(nums, multi, i+1, start);
     
    // which value is greater update into dp nd return it;    
        return dp[i][start] = Math.max(oper1, oper2);
        
    }
    public int maximumScore(int[] nums, int[] multi) {
        dp = new int[1001][1001];
        return operation(nums, multi, 0, 0);
        
    }
}