class Solution {
    private int goodPair(int n)
    {
      if(n < 2)return 0;
      
      return ((n-1) + goodPair(n-1));
    }
    public int numIdenticalPairs(int[] nums) {
      int frq[] = new int[101];
      
      for(int val : nums)
      {
        frq[val]++;
      }
      int totalPair = 0;
      for(int i = 1 ; i <= 100; i++)
      {
        if(frq[i] >= 1)
          totalPair += goodPair(frq[i]);
      }
      return totalPair;
    }
}