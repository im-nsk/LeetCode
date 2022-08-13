class Solution {
    public List<Integer> findSubstring(String s, String[] words) 
    {
      List<Integer> result = new ArrayList<>();
      Map<String, Integer>map = new HashMap<>();
      
      for(String word : words)
      {
        map.put(word, map.getOrDefault(word,0)+1);
      }
      
      int wordSize = words[0].length();
      int wordLen = words.length;
      int windowSize = wordLen * wordSize;
      boolean flag = false;
      
      for(int i = 0; i + windowSize - 1 < s.length(); i++)
      {
        String lastWord = s.substring(i + windowSize-wordSize, i + windowSize);
        
        if(map.containsKey(lastWord))
        {
           flag = false;
          Map<String, Integer>currMap = new HashMap<>(map);
          for(int j = i; j < i + windowSize; j += wordSize)
          {
            String currWord = s.substring(j, j + wordSize);
            currMap.put(currWord,currMap.getOrDefault(currWord, 0) -1);
            
            if(currMap.get(currWord) < 0)
            {
              flag = true;
              break;
            }
              
          }
        
        if(!flag)
          result.add(i);
       }
      }
        return result;
    }
}