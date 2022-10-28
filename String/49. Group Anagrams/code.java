class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String value : strs){
            
            char freq[] = new char[26];
            for(char c : value.toCharArray())freq[c-'a']++;
            
            String group = String.valueOf(freq);
            
            if(!map.containsKey(group))
                map.put(group, new ArrayList<>());
            map.get(group).add(value);            
        }
        return new ArrayList<>(map.values());
    }
}