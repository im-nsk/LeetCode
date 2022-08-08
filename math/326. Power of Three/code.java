class Solution {
  public boolean checkPower(int n)
  {
    if(n==0)return false;
    if(n==1) return true;
    
    if(n%3 ==0)
    {
      return checkPower(n/3);
    }
    else
      return false;
      
  }
    public boolean isPowerOfThree(int n) {
      
      return checkPower(n);
        
    }
}