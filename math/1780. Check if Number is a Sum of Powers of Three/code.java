class Solution {
    public boolean checkPowersOfThree(int n) {
      
      int powerThree[] = new int[16];
      for(int i = 0; i < 16; i++)
        powerThree[i] = (int)Math.pow(3,i);
      
      for(int i = 15; i >= 0; i--)
      {
        if(n >= powerThree[i])
          n -= powerThree[i];
      }
        return n == 0;
    }
}




class Solution {
    public boolean checkPowersOfThree(int n) {
      
      if(n == 0) return true;
      int rem = n%3;
      
      if(rem == 2) return false;
      
      return checkPowersOfThree(n/3);  
    }
}