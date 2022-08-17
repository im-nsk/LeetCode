class Solution {
    public int[] sortEvenOdd(int[] nums) 
    {
      if(nums.length <= 1) return nums;
      
      int even[] = new int[(nums.length +1)/2];
      int odd[] = new int[nums.length/2];
      
      int ei = 0;
      int oi = 0;
      for(int i = 0; i < nums.length; i++)
      {
        if(i % 2 == 0)
          even[ei++] = nums[i];
        else
          odd[oi++] = nums[i];
      }
        
      int result[] = new int[nums.length];
      Arrays.sort(even);
      Arrays.sort(odd);
       ei = 0;
      for(int i = 0; i < nums.length; i++)
      {
        if(i % 2 == 0)
          result[i] = even[ei++];
        else
         result[i] = odd[--oi];
      }
      return result;
    }
}