class Solution {
    public boolean doesAliceWin(String s) {

        // HashSet<Character> vow= new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(char ch: s.toCharArray())
            switch(ch){
                case 'a','e','i','o','u','A','E','I','O','U':
                    return true; 
            }
        return false;
    }
}