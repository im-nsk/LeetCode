class Solution {
    public String removeKdigits(String num, int k) 
    {
      Stack<Character> st = new Stack<>();
      
      for(int i = 0; i<num.length(); i++)
      {
        char c = num.charAt(i);
        while(st.size()>0 && k>0 && st.peek() > c)
        {
          st.pop();
          k--;
        }
        st.push(c);
      }
      
      while(k>0)
      {
        st.pop();
        k--;
      }
      
      char ch[] = new char[st.size()];
      int index = ch.length-1;
      while(index>=0)
      {
        ch[index] = st.pop();
        index--;
      }
      
      int noZeroInd = 0;
      while(noZeroInd<ch.length && ch[noZeroInd]=='0')
      {
        noZeroInd++;
        
      }
      
      StringBuilder sb = new StringBuilder();
      for(int i = noZeroInd; i < ch.length; i++)
      {
        sb.append(ch[i]);
      }
      
      if(sb.length() == 0)sb.append("0");
      
      return sb.toString();
        
    }
}