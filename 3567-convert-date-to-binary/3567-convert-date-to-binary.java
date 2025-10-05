class Solution {
    public String helper(int num){
        return Integer.toBinaryString(num);
    }
    public String convertDateToBinary(String date) {
        String cal[] = date.split("-");
        int y = Integer.parseInt(cal[0]);
        int m = Integer.parseInt(cal[1]);
        int d = Integer.parseInt(cal[2]);
        return helper(y) + "-" + helper(m) + "-" + helper(d);
    }
}