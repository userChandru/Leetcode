class Solution {
    public int reverseDegree(String s) {
        int sum=0, i=1;
        for(char ch: s.toCharArray())
            // System.out.println('a' + 26 - ch);
            sum += ('a' + 26 - ch) * i++;
        return sum;
    }
}