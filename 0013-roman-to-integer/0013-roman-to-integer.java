class Solution {
    public int romanToInt(String s) {
        int num = 0;
        Map<Character, Integer> temp = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = temp.get(s.charAt(i));
            if (curr < prev) {
                num -= curr;
            } else {
                num += curr;
            }
            prev = curr;
        }
        return num;
    }
}