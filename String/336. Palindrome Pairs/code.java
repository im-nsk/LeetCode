class Solution {
    //check string is palindrome or not
    private boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--))return false;
        }
        return true; 
    }
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
       // for storing length of each string.
        Set<Integer> set = new TreeSet<>();
        
        // put all string with there index in hash, nd length of string in set
        for(int i = 0; i< words.length; i++){
            map.put(words[i], i);
            set.add(words[i].length());
        }
        
        for(int i = 0; i < words.length; i++){
            int len = words[i].length();
          // if stiring having just one length then check for empty string , if yes then return the index of both string.  
            if(len == 1){
                if(map.containsKey("")){
                    result.add(Arrays.asList(i,map.get("")));
                    result.add(Arrays.asList(map.get(""), i));
                }
                continue;
            }
           // check after reversing the string, reversed string is available in hash 
            String revStr = new StringBuilder(words[i]).reverse().toString();
            if(map.containsKey(revStr) && map.get(revStr) != i){
                 result.add(Arrays.asList(i,map.get(revStr)));
            }
         // with the different length string, check for right left substring .  
            for(Integer k : set){
                if(k == len)
                    break;
             // this is for right substring   
                if(isPalindrome(revStr, 0, len-k-1)){
                    String s1 = revStr.substring(len-k);
                    if(map.containsKey(s1)){
                         result.add(Arrays.asList(i,map.get(s1)));
                    }
                }
            // this is for left substring    
                if(isPalindrome(revStr, k, len-1)){
                    String s2 = revStr.substring(0, k);
                    if(map.containsKey(s2)){
                         result.add(Arrays.asList(map.get(s2),i));
                    }
                }
            }
            
        }
        return result;
    }
}