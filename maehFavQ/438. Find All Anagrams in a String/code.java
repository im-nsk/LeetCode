class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
      List<Integer> list = new ArrayList<>();
      int charArray[] = new int[26];
      for(char ch : p.toCharArray())
      {
        charArray[ch-'a']++;
      }
      
      int left = 0;
      int right = 0;
      int count = p.length();
      while(right < s.length())
      {
        if(charArray[ s.charAt(right++) - 'a']-- >= 1 )
          count--;
        
        if(count == 0)
          list.add(left);
        
        if(right - left == p.length() && charArray[s.charAt(left++) - 'a']++ >=0)
         count ++;
        
      }
      return list;
        
    }
}