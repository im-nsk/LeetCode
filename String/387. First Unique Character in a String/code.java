class Solution {
    public int firstUniqChar(String s) 
    {
      char freq[] = new char[26];
      
      for(char c : s.toCharArray())
          freq[c - 'a']++;
      
      for(int i = 0; i < s.length(); i++)
      {
        if(freq[s.charAt(i) - 'a'] == 1)
          return i;
      }
        return -1;
    }
}