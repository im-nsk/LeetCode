class Solution {
    private boolean checkEvenDigit(int n)
    {
      int sum = 0;
      while(n != 0)
      {
        sum += n%10;
        n /= 10;
      }
     return (sum % 2) == 0;
    }
    public int countEven(int num) 
    {
      
      if(num == 1) return 0;
      int n = 2;
      int count = 0;
      while(n <= num)
      {
        if(checkEvenDigit(n)) 
          count++;
        n++;
      }
        return count;
    }
}