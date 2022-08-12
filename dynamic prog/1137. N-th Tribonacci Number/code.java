class Solution {
  
  int dp[];
   public int calculate(int n)
   {
     if(n < 3)
     {
       if(n ==2) return 1;
       return n;
     }
     if(dp[n] != 0) return dp[n];
     dp[n] = calculate(n-1) + calculate(n-2) + calculate(n-3);
     return dp[n];

   }
    public int tribonacci(int n) 
    {
      dp = new int[n+1];
      return calculate(n);
    }
}