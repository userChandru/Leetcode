class Solution {

    public boolean helper(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    } 

    public List<String> validateCoupons(String[] code, String[] line, boolean[] active) {
        
        int n = code.length;
        HashMap<String, Integer> Id = new HashMap<>();
        Id.put("electronics", 1);
        Id.put("grocery", 2);
        Id.put("pharmacy", 3);
        Id.put("restaurant", 4);

        List<Integer> valid = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!Id.containsKey(line[i]) || code[i] == null || code[i].isEmpty()) {
                active[i] = false;
            }
            if (active[i])
                for (char c : code[i].toCharArray())
                    if (!helper(c)) {
                        active[i] = false;
                        break;
                    }

            if (active[i]) 
                valid.add(i);
        }

        valid.sort((i, j) -> {
            int li = Id.get(line[i]);
            int lj = Id.get(line[j]);
            if (li != lj) return Integer.compare(li, lj);
            return code[i].compareTo(code[j]);
        });

        List<String> ans = new ArrayList<>(valid.size());
        for (int idx : valid)
            ans.add(code[idx]);
        return ans;
    }
}