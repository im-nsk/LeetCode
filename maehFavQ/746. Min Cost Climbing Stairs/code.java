class Solution {
    public int minCostClimbingStairs(int[] cost) 
    {
      int step1 = 0;
      int step2 = 0;
      int currStep = 0;
      
      for(int i = 0; i<cost.length; i++)
      {
        currStep = cost[i] + Math.min(step1, step2);
        step1 = step2;
        step2 = currStep;
      }
      return Math.min(step1,step2);
        
    }
}