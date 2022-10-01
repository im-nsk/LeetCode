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
        
         // if left is greater than right support will be there from left side , so traversal toward left by reducing right:
         // and if right is greater than left support will be there from right side , so traversal toward right by icreasing left: 
          if(height[left] > height[right])
            right--;
          else
            left ++;
      }
      
    return area;
        
    }
}
