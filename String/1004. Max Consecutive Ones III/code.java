class Solution {
    public int longestOnes(int[] nums, int k) 
    {
      int digitFrq[] = new int[2];
      int startWindow = 0;
      int maxLen = 0;
      int conMaxNum = 0;
      for(int endWindow = 0; endWindow < nums.length; endWindow++)
      {
        if(nums[endWindow] == 1)
        digitFrq[nums[endWindow]]++;
        
        maxLen = Math.max(maxLen, digitFrq[nums[endWindow]]);
        
        while(endWindow - startWindow - maxLen + 1 > k)
        {
          digitFrq[nums[startWindow++]]--;
        }
        conMaxNum = Math.max(conMaxNum, endWindow - startWindow +1);
      }
        return conMaxNum;
    }
}