class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        char[] arr = s.toCharArray();
        int temp = 0;
        for(char ch : arr){
            if(ch=='(')
                temp++;
            else if(ch==')')
                temp--;
            if((ch=='(' && temp>1) || (ch==')' && temp>0))
                ans.append(ch);
        } 
        return ans.toString();
    }
}