class Solution {
    public int minSetSize(int[] arr) 
    {
      int freq[] = new int[100001];
      int len = arr.length/2;
      
      for(int val : arr)
        freq[val]++;
      
      int tempArray[] = new int[arr.length];
      int k = 0;
      for(int val : freq)
      {
        if(val != 0)
          tempArray[k++] = val;
      }
      Arrays.sort(tempArray);
      int sum = 0;
      int result = 0;
      for(int i = arr.length-1; i >=0; i--)
      {
         sum += tempArray[i];
        result ++;
        if(arr.length - sum <= len)
          return result;
      }
      return -1;
    }
}