class Solution {
    public String getString(String s)
    {
      int backSpaceCount = 0;
      StringBuilder sb = new StringBuilder();
      
      
      for(int i = s.length()-1; i>=0; i--)
      {
        if(s.charAt(i) == '#')
          backSpaceCount++;
        else if(backSpaceCount > 0)
          backSpaceCount--;
        else
          sb.append(s.charAt(i));
      }
      return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) 
    {
        return getString(s).equals(getString(t));
      
    }
}