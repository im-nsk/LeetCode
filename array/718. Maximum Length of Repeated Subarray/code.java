Question: https://leetcode.com/problems/maximum-length-of-repeated-subarray/
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int maxLen = 0;
        // for storing the repetation of similar value:
        // dp array length is n+1 because by default array has 0 value and when we store the value of last index of array then we have add + 1 with 0(refer line: )
        int dp[][] = new int[nums1.length+1][nums2.length+1];
        
      // traverse array from last because we can't simply access -1 array element; nd to avoid clumsy code  
        for(int i = nums1.length - 1; i >= 0; i--){
            for(int j = nums2.length - 1; j >= 0; j--){
               // num1 and num2 having same value then increase the value by 1 with the next value 
                if(nums1[i] == nums2[j]){
                    dp[i][j] = dp[i+1][j+1]+1;
                 // update maxLen if it is lesser than dp[i][j]   
                    if(maxLen < dp[i][j])
                        maxLen = dp[i][j];
                }
            }
        }
     // return maxLen    
        return maxLen; 
    }
}

// for detailed clarification watch video: by going csLand on youtube: or click the link: 
// 