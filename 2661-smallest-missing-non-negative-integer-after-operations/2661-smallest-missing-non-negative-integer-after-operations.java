class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int min = Integer.MAX_VALUE;
        int minInd = 0;
        int n = nums.length;

        int arr[] = new int[value];
        Arrays.fill(arr, 0);

        for (int i = 0; i < n; i++) {
            int num = nums[i] % value;
            if (num < 0) {
                num %= value;
                num += value;
            }
            arr[num]++;
        }

        for (int i = 0; i < value; i++) {
            if (min > arr[i]) {
                minInd = i;
                min = arr[i];
            }
        }
        return min * value + minInd;
    }
}