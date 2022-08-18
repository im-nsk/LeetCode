class Solution {
  
    private int getSumOfDigit(int n)
    {
      int sumDigit = 0;
      while(n != 0)
      {
        sumDigit += Math.pow(n%10,2);
        n /= 10;
      }
      return sumDigit;
    }
    public boolean isHappy(int n) {
      
      HashSet<Integer> set = new HashSet<>();
      
      while(!set.contains(n))
      {
        set.add(n);
        n = getSumOfDigit(n);
        if(n == 1)
          return true;
        
      }
        return false;
    }
}