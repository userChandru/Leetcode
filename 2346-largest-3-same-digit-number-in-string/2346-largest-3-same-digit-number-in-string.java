class Solution {
    public String largestGoodInteger(String num) {
        int n=-1, i=0;
        String ans = "";
        while(i+2 < num.length()){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2) && num.charAt(i)-'0'>n)
                n=num.charAt(i)-'0';
            i++;
        }
        if(n==-1)
            return ans;
        else
            ans = Integer.toString(n);
        return ans+ans+ans;
    }
}