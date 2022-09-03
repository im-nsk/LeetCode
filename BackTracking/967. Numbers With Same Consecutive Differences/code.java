Brute force approach: Time limit Approach...

class Solution {
    private boolean getDiffInDigit(int n, int k)
    {
        int dig1 = n % 10;
        n /= 10;
        
        while(n != 0)
        {
            int dig2 = n % 10;
            if(Math.abs(dig2 - dig1) != k)
                return false;
            dig1 = dig2;
            n /= 10;
        }
        return true;
        
    }
    public int[] numsSameConsecDiff(int n, int k) {
        int start = 1;
        int inc = n;
        List<Integer> result = new ArrayList<>();
        
        while(n > 1)
        {
            start = 10 * start;
            n--;
        }
        int end = start*10;
        
        while(start < end)
        {
            if(getDiffInDigit(start, k))
                result.add(start);
            start ++;;   
        }
        
        int arrRes[] = new int[result.size()];
        
        for(int i = 0; i< arrRes.length; i++)
            arrRes[i] = result.get(i);
        return arrRes;
        
    }
}



BackTracking approach::Optimal Approach

class Solution {
    private void backTracking(int n, int k , List<Integer> list, int currValue)
    {
        if(n <= 0)
        {
            list.add(currValue);
            return;
        }
        
        for(int i = 0; i< 10; i++)
        {
            if(i == 0 && currValue == 0) continue;
            else if(currValue == 0 && i != 0)
                backTracking(n-1, k, list, i);
            else if(Math.abs(currValue % 10 - i) == k)
                backTracking(n-1, k, list, currValue * 10 + i);
        }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        
        List<Integer> list = new ArrayList<>();
        backTracking(n, k, list, 0);
        int result_array[] = new int[list.size()];
        
        for(int i = 0; i< result_array.length; i++)
            result_array[i] = list.get(i);
        
        return result_array;
        
    }
}