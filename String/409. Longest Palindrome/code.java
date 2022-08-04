class Solution {
    public int longestPalindrome(String s) 
    {
      int countFreq[] = new int[128];
      int length = 0;
      for(Character c: s.toCharArray())
      {
        if(++countFreq[c] == 2)
        {
          length += 2;
          countFreq[c] = 0;
        }
      }
      return (length == s.length()) ? length : length+1;
    }
}