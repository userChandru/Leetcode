class Solution {
    public String helper(int num){
        return Integer.toBinaryString(num);
    }
    public String convertDateToBinary(String date) {
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);

        StringBuilder ans = new StringBuilder();
        ans.append(Integer.toBinaryString(Integer.parseInt(y)));
        ans.append("-");
        ans.append(Integer.toBinaryString(Integer.parseInt(m)));
        ans.append("-");
        ans.append(Integer.toBinaryString(Integer.parseInt(d)));
        return ans.toString();
    }
}