// Last updated: 7/9/2026, 9:51:57 AM
class Solution{
    public int canCompleteCircuit(int[] gas,int[] cost){
        int totalGas=0;
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            totalGas=totalGas+(gas[i]-cost[i]);
            tank=tank+(gas[i]-cost[i]);
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(totalGas<0){
            return -1;
        }
        return start;
    }
}