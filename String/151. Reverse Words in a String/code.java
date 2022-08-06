class Solution {
    public String reverseWords(String s) 
    {
      String s_array[] = s.split(" ");
      String s1 = "";
      
      for(int i = s_array.length-1; i>=0; i--)
      {
        if(!s_array[i].equals(""))
        {
          s1 = s1 + s_array[i]+" ";
        }
        
      }
       s1 = s1.trim();
      return s1;
    }
}