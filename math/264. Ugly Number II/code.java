class Solution {
    public int nthUglyNumber(int n) {
      int numOfTime = n;
      List<Integer> list = new ArrayList<>();
      
      int index2 = 0;
      int index3 = 0;
      int index5 = 0;
      
      list.add(1);
      while(numOfTime-- > 1)
      {
        int fact2 = list.get(index2) * 2;
        int fact3 = list.get(index3) * 3;
        int fact5 = list.get(index5) * 5;
        int minVal = Math.min(fact2, Math.min(fact3, fact5));
        list.add(minVal);
        
        if(minVal == fact2) 
          index2++;
        if(minVal == fact3) 
          index3++;
        if(minVal == fact5) 
          index5++;
      }
        return list.get(n-1);
    }
}