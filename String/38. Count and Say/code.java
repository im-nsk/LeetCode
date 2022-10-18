https://leetcode.com/problems/count-and-say/
class Solution {
    private String getSequence(String result){
        int i = 0;
        StringBuilder builder = new StringBuilder();
        while(i < result.length()){
            char val = result.charAt(i);
            int count = 0;
            while(i < result.length() && val == result.charAt(i)){
                count++;
                i++;
            }
            builder.append(String.valueOf(count));
            builder.append(val);   
        }
        return builder.toString();
    }
    public String countAndSay(int n) {
        String result = "1";
        
        for(int i = 1; i<n; i++){
            result = getSequence(result);
        }
        return result;
    }
}