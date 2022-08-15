class Solution {
  
   private int getNumber(char c)
   {
     switch(c)
     {
       case 'I' : return 1;
       case 'V' : return 5;
       case 'X' : return 10;
       case 'L' : return 50;
       case 'C' : return 100;
       case 'D' : return 500;
       case 'M' : return 1000;
     }
     return 0;
   }
    public int romanToInt(String s) {
      int ind = 0;
      int currElem, nextElem;
      int numVal = 0;
      while(ind < s.length())
      {
        if(ind == s.length()-1)
          return numVal += getNumber(s.charAt(ind));
        
        currElem = getNumber(s.charAt(ind));
        nextElem = getNumber(s.charAt(ind+1));
        
        if(currElem >= nextElem)
        {
          numVal += currElem;
          ind++;
        }
        else
        {
          numVal += (nextElem-currElem);
          ind += 2;
        }
        
      }
      return numVal;
        
    }
}