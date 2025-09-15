class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;

        for(String word: text.split(" ")){
            boolean flag = true;
            for (char c : brokenLetters.toCharArray()) 
                if (word.indexOf(c) != -1) { 
                    flag = false;
                    break;
                }
            if (flag)
                count++;
        }
        return count;
    }
}