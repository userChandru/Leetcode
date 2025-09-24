class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        
        StringBuilder ans = new StringBuilder();

        if ((numerator < 0) ^ (denominator < 0)) {
            ans.append("-");
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        ans.append(num / den);
        long rem = num % den;
        if (rem == 0) return ans.toString();

        ans.append(".");
        HashMap<Long, Integer> map = new HashMap<>();

        while (rem != 0) {
            if (map.containsKey(rem)) {
                ans.insert(map.get(rem), "(");
                ans.append(")");
                break;
            }
            map.put(rem, ans.length());

            rem *= 10;
            ans.append(rem / den);
            rem %= den;
        }

        return ans.toString();
    }
}
