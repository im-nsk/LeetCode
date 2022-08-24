class Solution {
    public boolean squareIsWhite(String coordinates) {
      
      int alpha = coordinates.charAt(0) - 'a' + 1;
      int num = coordinates.charAt(1) -'0';
      
      if((alpha % 2 ==0 && num % 2 ==0) || (alpha % 2 !=0 && num % 2 !=0))
        return false;
        return true;
        
    }
}