class Solution {
    public int longestPalindrome(String[] words) {
        
        HashMap<String, Integer> storing = new HashMap<>();
        int sameChar = 0;
        int length = 0;
        
        for(String word : words)
        {
            String revWord = new StringBuilder(word).reverse().toString();
            
            if(storing.containsKey(revWord) && storing.get(revWord) > 0)
            {
                if(word.charAt(0) == word.charAt(1))
                    sameChar--;
                
                    storing.put(revWord, storing.get(revWord)-1);
                    length += 4;   
            }
            else
            {
                if(word.charAt(0) == word.charAt(1))
                    sameChar++;
               storing.put(word, storing.getOrDefault(word, 0) + 1);
            }
        }
        
        if(sameChar > 0)
            length += 2;
        return length;
    }
}