class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
      HashMap<Integer,Integer> map = new HashMap<>();
      
      for(int i = 0; i<nums.length; i++)
      {
        Integer diff = target - nums[i];
        if(map.containsKey(diff))
        {
          int result[] = {map.get(diff), i};
          return result;
        }
        map.put(nums[i],i);
      }
      return null;
        
    }
}