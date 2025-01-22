class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int count = map.get(s.charAt(i));
                count++;
                map.put(s.charAt(i), count);
            }
            else{
                map.put(s.charAt(i), 1);
                q.add(s.charAt(i));
            }
        }
        while(!q.isEmpty()){
            char firstChar = q.poll();
            int count=map.get(firstChar);
            if(count == 1)
                return s.indexOf(firstChar);
        }
        return -1;
    }
}