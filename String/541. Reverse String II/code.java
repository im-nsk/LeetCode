class Solution {
    public String reverseStr(String s, int k) {
      StringBuilder sb = new StringBuilder();
      boolean multi = true;
      for(int i = 0; i < s.length(); i += k)
      {
        String str = (i+k+1) > s.length() ? s.substring(i) : s.substring(i,i+k);
        sb.append((multi) ? new StringBuilder(str).reverse() : str);
        multi = ! multi;
      }
      
      return sb.toString();
        
    }
}