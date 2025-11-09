class Solution {
    public int countOperations(int num1, int num2) {
        int ans = 0;
        while (Math.min(num1, num2) > 0) {
            if (num1 > num2){
                int t = num1;
                num1 = num2;
                num2 = t;
            }
            ans += num2 / num1;
            num2 %= num1;
        }
    return ans;
    }
}