class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        int freq[]=new int[128];
        Arrays.fill(freq,0);
        int len, max=0, i=0, j=0;
        while(j!=s.length()){
            char ch = s.charAt(j);
            if(freq[ch]==0){
                freq[ch]++;
                j++;
            }
            else{
                freq[s.charAt(i)]--;
                i++;
            }
            len=j-i;
            if(max<len)
                max=len;
        }
        return max;
    }   
}