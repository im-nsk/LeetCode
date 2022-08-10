class Solution {
    public int characterReplacement(String s, int k) 
    {
      int charArray[] = new int[26];
      int startWindow = 0;
      int maxLength = 0;
      int longestChar = 0;
      
      
      for(int endWindow = 0; endWindow < s.length(); endWindow++)
      {
        charArray[s.charAt(endWindow)- 'A']++;
        maxLength = Math.max(maxLength, charArray[s.charAt(endWindow)- 'A'] );
        
        while((endWindow - startWindow - maxLength + 1) > k)
        {
          charArray[s.charAt(startWindow++)- 'A']--;
          
        }
        longestChar = Math.max(longestChar, endWindow - startWindow + 1);
        
      }
        return longestChar;
    }
}