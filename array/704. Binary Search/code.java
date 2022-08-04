class Solution {
    public int search(int[] nums, int target) 
    {
      int start = 0;
      int end = nums.length-1;
      
        while(start<=end)
        {
          int pivot = (start + end)/2;
          if(nums[pivot] == target) return pivot;
          else if(nums[pivot] > target)end = pivot-1;
          else start = pivot+1;
        }
      return -1;
    }
}