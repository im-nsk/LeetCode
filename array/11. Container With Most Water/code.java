class Solution {
    public int maxArea(int[] height) 
    {
     // start with first and last:   
      int left = 0;
      int right = height.length-1;
      int area = 0;
      
      // traversal till left is smaller than right:  
      while(left < right)
      {
       // get the area by multiple of min height[left], height[right] and right-left:   
        area = Math.max(area, Math.min(height[left], height[right])*(right-left));
        
         // 
          if(height[left] > height[right])
            right--;
          else
            left ++;
      }
      
    return area;
        
    }
}
