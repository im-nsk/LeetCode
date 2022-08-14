class Solution {
   boolean checkSelfDivNum(int n)
  {
     int temp = n;
     while(temp != 0)
     {
      int rem = temp % 10;
       if(rem == 0) return false;
       if(n % rem != 0)
         return false;
       temp /= 10;
     }
    return true;
  }
    public List<Integer> selfDividingNumbers(int left, int right)
    {
      
      List<Integer> result = new ArrayList<>();
      for(int i = left; i<=right ; i++)
      {
        if(checkSelfDivNum(i))
          result.add(i);
      }
        return result;
    }
}