class Solution {
    public int numWaterBottles(int num, int exc) {
        int ans = num, emp = num, newBot;
        while(emp>=exc){
            newBot = emp/ exc;
            emp = emp % exc;
            ans += newBot;
            emp += newBot;
        }
        return ans;
    }
}