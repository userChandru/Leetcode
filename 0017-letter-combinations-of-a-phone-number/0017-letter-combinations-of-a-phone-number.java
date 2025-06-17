class Solution {

    static HashMap<Integer, String> map;

    private void addNumber(){
        map = new HashMap<>();
            map.put(2,"abc");
            map.put(3,"def");
            map.put(4,"ghi");
            map.put(5,"jkl");
            map.put(6,"mno");
            map.put(7,"pqrs");
            map.put(8,"tuv");
            map.put(9,"wxyz");
    }
    private void helper(List<String> ans, int num){
        if(ans.isEmpty())
            for(char ch : map.get(num).toCharArray())
                ans.add(Character.toString(ch));
        else {
            int size= ans.size();
            while(size--!=0){
                String temp = ans.remove(0);;
                for(char ch : map.get(num).toCharArray())
                    ans.add(temp.concat(Character.toString(ch)));
            }
        }
    }
    
    public List<String> letterCombinations(String digits) {
        this.addNumber();
        List<String> ans=new LinkedList<>();
        if (digits.length()==0)
            return ans;

        for(char ch: digits.toCharArray()){
            int num = ch -'0';
            this.helper(ans, num);
        }
        System.out.println(ans);
        return ans;
    }
}