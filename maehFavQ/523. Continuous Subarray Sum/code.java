class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      
      int subArraySum = 0;
      HashMap<Integer,Integer> map = new HashMap<>();
      map.put(0,-1);
      int tot = 0;
      
      for(int i = 0; i < nums.length; i++)
      {
         tot += nums[i];
         int rem = tot % k;
         if(!map.containsKey(rem))
           map.put(rem, i);
         else if(i - map.get(rem) > 1)
           return true;
      }
        return false;
    }
}