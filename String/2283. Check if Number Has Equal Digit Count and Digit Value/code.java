class Solution {
    public boolean digitCount(String num) {
      
      int freq[] = new int[10];
      
      for(char c : num.toCharArray())
        freq[c-'0']++;
      
      for(int i = 0; i < num.length(); i++)
      {
        int n = num.charAt(i) - '0';
        if(freq[i] != n)
          return false;
      }
        return true;
    }
}