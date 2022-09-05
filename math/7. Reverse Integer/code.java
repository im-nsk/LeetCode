class Solution {
    private long getReverseValue(int n)
    {
        long reverseVal = 0;
        while(n != 0)
        {
            reverseVal =  reverseVal * 10 + n%10;
            n /= 10;
        }
        
        return reverseVal;
    }
    public int reverse(int x) { 
        int sign = 1;
        
        if(x < 0)
            sign = -1;
        
            long result = getReverseValue(Math.abs(x));
        if(result < -2147483648 || result > 2147483647)
            return 0;

            return (int)result * sign; 
    }
}