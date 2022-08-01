
class Solution {
    public int uniquePaths(int m, int n) 
    {
      int dp[][] = new int[m+1][n+1];
      return findPath(dp,m,n);  
    }
  
    public static int findPath(int dp[][], int m, int n)
    {
      if(m == 1 || n==1)
        return 1;
      if(dp[m][n] != 0)
        return dp[m][n];

      return dp[m][n] = findPath(dp,m-1,n)+findPath(dp,m,n-1);
    }
}
