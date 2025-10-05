class Solution {
    public String helper(int num){
        return Integer.toBinaryString(num);
    }
    public String convertDateToBinary(String date) {
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);
        
        int year = Integer.parseInt(y);
        int month = Integer.parseInt(m);
        int day = Integer.parseInt(d);

        StringBuilder ans = new StringBuilder();
        ans.append(Integer.toBinaryString(year));
        ans.append("-");
        ans.append(Integer.toBinaryString(month));
        ans.append("-");
        ans.append(Integer.toBinaryString(day));
        return ans.toString();
    }
}