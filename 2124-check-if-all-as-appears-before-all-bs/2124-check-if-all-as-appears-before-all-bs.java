class Solution {
    public boolean checkString(String s) {
        boolean flag=true;
        for(char ch:s.toCharArray()){
            if(flag && ch=='a')
                continue;
            else if(ch=='b')
                flag=false;
            else 
                return false;
        }
        return true;
    }
}