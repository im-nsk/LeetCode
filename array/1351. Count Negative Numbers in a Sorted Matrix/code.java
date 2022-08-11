class Solution {
    public int countNegatives(int[][] grid) {
      int negCount = 0;
      int m = 0;
      int n = grid[0].length-1;
      while(m<grid.length && n>=0)
      {
        if(grid[m][n]<0)
        {
          negCount++;
          if(n == 0)
          {
            m++;
            n = grid[0].length-1;
          }
          else 
            n--;
          
            
        }
        else{
          m++;
          n = grid[0].length-1;
        }
        
      }
        return negCount;
    }
}