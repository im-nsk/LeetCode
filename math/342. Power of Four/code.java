class Solution {
    private boolean checkAgain(int n )
    {
      if(n == 0) return false;
      if(n == 1) return true;
      
      if(n % 4 == 0)
        return checkAgain(n/4);
      else
        return false;
    }
    public boolean isPowerOfFour(int n) {
      return checkAgain(n);   
    }
}