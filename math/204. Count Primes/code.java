class Solution {
    public int countPrimes(int n) 
    {
      boolean number[] = new boolean[n+1];
      for(int i = 0; i<= n; i++)
        number[i] = true;
      for(int i = 2; i*i <= n; i++)
      {
        if(number[i] == true)
        {
          for(int j = i*i; j<=n; j += i)
            number[j] = false;
        }
      }
      int countPrime = 0;
      for(int i = 2; i < n; i++)
        if(number[i] == true)
          countPrime++;
        return countPrime;
    }
}