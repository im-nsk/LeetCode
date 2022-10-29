class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        
        int arr[][] = new int[growTime.length][2];
        int n = growTime.length;
        for(int i = 0; i < n; i++){
            arr[i][1] = plantTime[i];
            arr[i][0] = growTime[i];
        }
        Arrays.sort(arr, (a,b) -> (b[0]-a[0]));
        int max = 0;
        int time = 0;
        for(int i = 0; i < n; i++){
            time += arr[i][1];
            max = Math.max(max, time + arr[i][0]);
        }
        
        return max;
    }
}