class Solution {
    public int numIslands(char[][] grid) {
      int count = 0;
      for(int i = 0; i<grid.length; i++)
      {
        for(int j = 0; j<grid[0].length; j++)
        {
          if(grid[i][j] == '1')
          {
            count++;
            searchIsland(grid,i,j);
          }
        }
      }
        return count;
    }
  public void searchIsland(char[][] grid, int i, int j)
  {
    if(i<0 || j < 0 || i>=grid.length || grid[0].length<=j || grid[i][j] == '0')
      return;
    grid[i][j] = '0';
    searchIsland( grid,  i+1,  j);
    searchIsland( grid,  i-1,  j);
    searchIsland( grid,  i,  j+1);
    searchIsland( grid,  i,  j-1);
    
  }
}