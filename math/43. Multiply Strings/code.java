class Solution {
    public String multiply(String num1, String num2) {
      
      long n1 = Long.valueOf(num1);
      long n2 = Long.valueOf(num2);
      
      long n3 = n1*n2;
      return Long.toString(n3);
      
        
    }
}