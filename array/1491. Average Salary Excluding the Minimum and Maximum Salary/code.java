class Solution {
    public double average(int[] salary) {
      
      Arrays.sort(salary);
      int sum = 0;
      for(int i = 1; i < salary.length-1; i++)
      {
        sum += salary[i];
      }
        int n = salary.length - 2;
      
      return sum * 1.0 / n;
    }
}