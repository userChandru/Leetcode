class Solution {
    public String sortVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        List<Character> vowels = new ArrayList<>();
        HashSet<Character> flag = new HashSet<>();
        int n=s.length(), idx=0;

        flag.add('a');
        flag.add('e');
        flag.add('i');
        flag.add('o');
        flag.add('u');
        flag.add('A');
        flag.add('E');
        flag.add('I');
        flag.add('O');
        flag.add('U');

        for(int i=0; i<n; i++)
            if(flag.contains(ans.charAt(i)))
                vowels.add(ans.charAt(i));
        if(vowels.isEmpty())
            return s;
        Collections.sort(vowels);

        for(int i=0; i<n; i++)
            if((flag.contains(ans.charAt(i))))
                ans.setCharAt(i,vowels.get(idx++));

        return ans.toString();
    }
}