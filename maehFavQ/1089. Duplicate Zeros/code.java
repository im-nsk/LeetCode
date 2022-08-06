class Solution 
{
    public void duplicateZeros(int[] arr) 
    {
     
      int zeroCount = 0;
      for(int i : arr)
      {
        if(i == 0)zeroCount++;
      }
      
      int i = arr.length-1;
      int j = arr.length + zeroCount -1;
      
       while(i != j)
       {
         replaceValue(arr, i, j--);
         if(arr[i] == 0)
         {
           replaceValue(arr,i,j--);
         }
         i--;
       }
    }
  public void replaceValue(int arr[], int i , int j)
  {
    if(j<arr.length)
    {
      arr[j] = arr[i];
    }
  }
}