class Solution {
    public String helper(String word) {
        StringBuilder temp = new StringBuilder(word.toLowerCase());
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if ("aeiou".indexOf(ch) != -1)
                temp.setCharAt(i, '-');
        }
        return temp.toString();
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>();          
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelMasked = new HashMap<>();

        for (String word : wordlist) {
            exactWords.add(word);

            caseInsensitive.putIfAbsent(word.toLowerCase(), word);
            vowelMasked.putIfAbsent(helper(word), word);
        }

        String[] ans = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (exactWords.contains(q))
                ans[i] = q;
            else if (caseInsensitive.containsKey(q.toLowerCase()))
                ans[i] = caseInsensitive.get(q.toLowerCase());
            else if (vowelMasked.containsKey(helper(q)))
                ans[i] = vowelMasked.get(helper(q));
            else 
                ans[i] = "";
        }
        return ans;
    }
}
