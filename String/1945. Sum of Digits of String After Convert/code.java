class Solution {
    public int getLucky(String s, int k) {
      
      String numStr = "";
      
      for(char c : s.toCharArray())
         numStr += (c - 96);
      int num = 0;
      while(k-- != 0)
      {
        num = 0;
        for(char c : numStr.toCharArray())
           num += c - '0';
        numStr = String.valueOf(num);
      }
        return num;
    }
}