class Solution {
    private int reverse(int n){
        
        int num = 0;
        while(n != 0){
            num = num*10 + n%10;
            n /= 10;
        }
        
        return num;
    }
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;
        
        if( x == reverse(x))
            return true;
        return false;
    }
}