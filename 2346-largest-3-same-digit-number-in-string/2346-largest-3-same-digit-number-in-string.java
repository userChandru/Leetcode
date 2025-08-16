class Solution {
    public String largestGoodInteger(String num) {
        String nums[] = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for(String n: nums)
            if(num.contains(n))
                return n;
        return "";
    }
}