class Solution {
    public int trap(int[] height) {
        int result = 0;
        int left = 0, right = height.length-1;
        int leftPillar = 0, rightPillar = 0;
        
        while(left <= right){
         // get the highest right pillar nd to be ensure than from right side, there will be support   
            if(height[left] <= height[right]){
                if(height[left] >= leftPillar)
                    leftPillar = height[left]; // left side support for water trapping
                else
                    result += leftPillar - height[left]; // get the value how much water store
                left++; 
            }
            else // got the highest left pillar nd to be ensure than from left side, there will be support   
            {
                if(height[right] >= rightPillar){
                    rightPillar = height[right]; // right side support for water trapping
                }
                else
                    result += rightPillar - height[right];// get the value how much water store
                right--;
            }
        }
        return result;
        
    }
}