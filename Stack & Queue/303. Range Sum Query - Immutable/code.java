class NumArray {
    int sum[];
    public NumArray(int[] nums) {
        sum = new int[nums.length+1];
        int window = 0;
        
        for(int i = 0; i< nums.length; i++){
            window += nums[i];
            sum[i+1] = window;
        }
    }
    
    public int sumRange(int left, int right) {
        
        return sum[right+1] - sum[left];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */