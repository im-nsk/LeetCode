class Solution {
    public int maxProfit(int[] prices) 
    {
      int minValue = Integer.MAX_VALUE;
      int maxProfit = 0;
      
      for(int i = 0; i<prices.length; i++)
      {
        if(minValue>prices[i])
          minValue = prices[i];
        else if(prices[i] - minValue > maxProfit)
          maxProfit = prices[i] - minValue;
      }
        return maxProfit;
    }
}