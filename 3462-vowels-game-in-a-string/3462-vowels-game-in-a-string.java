class Solution {
    public boolean doesAliceWin(String s) {
        HashSet<Character> vow= new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(char ch:s.toCharArray())
            if(vow.contains(ch))
                return true;
        return false;
    }
}