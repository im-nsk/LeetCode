class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
      if(image[sr][sc] == color)return image;
      fillColor(image, image[sr][sc], sr, sc, color);
      return image;
        
    }
  public void fillColor(int [][]image, int color, int sr, int sc, int targetColor )
  {
  if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || color != image[sr][sc])
    return;
    image[sr][sc] = targetColor;
    
    fillColor(image, color,sr+1, sc, targetColor); 
    fillColor(image, color,sr, sc+1, targetColor);
    fillColor(image, color,sr-1, sc, targetColor);
    fillColor(image, color,sr, sc-1, targetColor);
  }
}