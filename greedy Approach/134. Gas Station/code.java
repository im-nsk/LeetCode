Problem Link: https://leetcode.com/problems/gas-station/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalSum = 0, result = 0;
        int gasSum = 0, costSum = 0;
     // traverse through each and every element
        for(int i = 0; i< gas.length; i++){
            
          // find the remaining gas nd keep adding till last, where we find totalSum is negative value, it means, we can't move forward with that fuel, make it totalfuel 0, start with next index:   
            totalSum += (gas[i]-cost[i]);
            
        // we need summation of gas nd cost, to check if gas sum is less than cost   sum, it shows we can't reach to our destination.
            gasSum += gas[i];
            costSum += cost[i];
              
            if(totalSum < 0 ){
                totalSum = 0;
                result = i+1;
            }   
        }
 // if till last index our total sum is positive nd gasSum is greater than costSum, return true, we can reach to desinantion: 
        
        return gasSum < costSum ? -1: result;
        
       // It's nothing but greedy Approch;
        
    }
}