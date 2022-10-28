class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String prev = "";
        for(String s : words){
            char freq[] = s.toCharArray();
            Arrays.sort(freq);
            String curr = String.valueOf(freq);
            
            if(!curr.equals(prev))
            {
                result.add(s);
                prev = curr;
            }
        }
        return result;
        
    }
}