class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentGas=0, startIndex=0, totalCost=0, totalGas=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<gas.length; i++){
            totalCost+=cost[i];
            totalGas+=gas[i];
            currentGas += (gas[i]-cost[i]);
            q.add(gas[i]-cost[i]);
            while(currentGas<0 && !q.isEmpty()){
                currentGas-=q.poll();
                startIndex++;
            }
        }
        return totalGas>=totalCost ? startIndex % gas.length : -1;
    }
}