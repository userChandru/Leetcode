class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for (int num : nums) {
            while (!st.isEmpty() && num < st.peek())
                st.pop();
            if (st.isEmpty() || num > st.peek()) {
                if (num > 0) 
                    ans++;
                st.push(num);
            }
        }
        return ans;
    }
}
