class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles, empty = numBottles;

        while (empty >= numExchange) {
            empty -= numExchange;   
            empty += 1;             
            ans += 1;               
            numExchange++;          
        }

        return ans;
    }
}