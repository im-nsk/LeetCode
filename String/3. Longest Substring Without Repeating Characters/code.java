class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> map = new HashSet<Character>();
        int max = 0;
        int i =0, j =0;
       while(j<s.length() && i<s.length())
       {
            char ch = s.charAt(i);
            char chj = s.charAt(j);
            if(!map.contains(chj))
            {
                map.add(chj);
                j++;
                max = Math.max(max,j-i);
            }
            else
            {
                map.remove(ch);
                i++;
            }
        }
        return max;
    }
}