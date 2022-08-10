class Solution {
    public String decodeString(String s) {
      Stack<Integer> counts = new Stack<>();
      Stack<String> stringCollect = new Stack<>();
      String result = "";
      int index = 0;
      
      while(index < s.length())
      {
        if(Character.isDigit(s.charAt(index)))
        {
          int count = 0;
          while(Character.isDigit(s.charAt(index)))
          {
            count = count * 10 + (s.charAt(index) - '0');
            index += 1;
          }
          counts.push(count);
        }
        else if(s.charAt(index) == '[')
        {
          stringCollect.push(result);
          result = "";
          index += 1;
          
        }
        else if(s.charAt(index) == ']')
        {
          StringBuilder temp = new StringBuilder(stringCollect.pop());
          int count = counts.pop();
          for(int i = 0; i < count; i++)
          {
            temp.append(result);
          }
          result = temp.toString();
          index += 1;
        }
        else
        {
          result += s.charAt(index);
          index += 1;
        }
      }
      return result;
    }
}