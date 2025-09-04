class Solution {
    public int reverse(int x) {
        // int sign = x<0 ? -1:1;
        long num=0;
        while(x!=0){
            num=num*10 + x%10;
            x/=10;
        }
        return (num>Integer.MAX_VALUE || num<Integer.MIN_VALUE)? 0:(int)num;
    }
}