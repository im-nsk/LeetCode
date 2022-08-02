class Solution {
    public int kthSmallest(int[][] matrix, int k) 
    {
      int size = matrix.length * matrix[0].length;
      int arr[] = new int[size];
      
      int j = 0;
      
      for(int val[] : matrix)
      {
        for(int value : val)
        {
          arr[j++] = value;
        }
      }
      Arrays.sort(arr);
      return arr[k-1];
        
    }
}