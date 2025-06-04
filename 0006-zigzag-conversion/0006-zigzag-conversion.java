class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=numRows || numRows==1)
            return s;
        int size = s.length();
    
        StringBuilder words[] = new StringBuilder[numRows];
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) 
            words[i] = new StringBuilder();
        int idx=0, i=0;
        while(idx < size){
            for(i=0; i<numRows && idx < size; i++)
                words[i].append(s.charAt(idx++));
            for(i-=2; i>0 && idx < size; i--)
                words[i].append(s.charAt(idx++));
        }
        for(StringBuilder t: words)
            ans.append(t);
        return ans.toString();
    }
}