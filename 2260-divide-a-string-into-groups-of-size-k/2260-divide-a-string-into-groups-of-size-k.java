class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int idx=0, i;
        String ans[] = new String[(n+k-1)/k];
        for(i=0; (i+k)<n; i+=k)
            ans[idx++] = s.substring(i, i+k);
        
        if(i<n){
            StringBuilder temp = new StringBuilder(s.substring(i));
            int m = k-n+i;
            while(m-->0)
                temp.append(fill);
            ans[idx] = temp.toString();
        }
        return ans;
    }
}