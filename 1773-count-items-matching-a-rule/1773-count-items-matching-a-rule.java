class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        int index=0;

        if(ruleKey.equals("color"))
            index=1;
        else if(ruleKey.equals("name"))
            index=2;
        
        for(List<String> curr: items)
            if(curr.get(index).equals(ruleValue))
                ans++;
        return ans;
    }
}