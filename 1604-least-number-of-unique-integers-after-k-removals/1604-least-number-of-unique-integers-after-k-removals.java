class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr)
            freq.put(num, freq.getOrDefault(num,0)+1);
            
        List<Integer> counts = new ArrayList<>(freq.values());
        Collections.sort(counts);
        for(int i=0; i<counts.size(); i++){
            if(counts.get(i)>k)
                return counts.size()-i;
            k-=counts.get(i);
        }
        return 0;
    }
}