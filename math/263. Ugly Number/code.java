class Solution {
    public int getFactor(int n, int factor)
    {
      if(n % factor != 0) return n;
      else
      {
        return getFactor(n/factor, factor);
      }
    }
    public boolean isUgly(int n) 
    {
      if(n == 1) return true;
      if(n <= 0) return false;
      int factor[] = {2,3,5};
      for(int val : factor)
      {
        n = getFactor(n, val);
      }
        
      return n == 1;
    }
}