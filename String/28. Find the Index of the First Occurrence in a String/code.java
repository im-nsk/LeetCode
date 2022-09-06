      /****************** Solution 1: ***************/

class Solution {
    public int strStr(String haystack, String needle) {
        
        int lenS = haystack.length();
        int lenN = needle.length();
        int k = 0;
        
        if(lenS < lenN) 
            return -1;
        
        int left = 0;
        int right = 0;
    
         while(right < lenS){
            char s = haystack.charAt(right);
            char n = needle.charAt(k++);
            if(s == n)
            { 
                right++;
                if(k == lenN)
                    return left;
            }
            else if( s != n)
            {
                k = 0;
                left++;
                right = left;
            } 
        }
        return -1;
    }
}




      /****************** Solution 2: ***************/

class Solution {
    public int strStr(String stack, String needle) {
        
        int index = 0;
        
        int lenS = stack.length();
        int lenN = needle.length();
        
        while(index <=  lenS - lenN )
        {
            if(stack.substring(index, lenN + index).equals(needle))
                return index;
            index++;
        }
        
        return -1;
        
    }
}