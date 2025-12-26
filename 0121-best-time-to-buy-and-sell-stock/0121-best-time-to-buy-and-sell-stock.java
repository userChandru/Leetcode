class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = 0;
        for(int price :  prices){
            if(price < min)
                min = price;
            else if(price - min > max)
                max = price - min;
        }
        return max;
    }
}