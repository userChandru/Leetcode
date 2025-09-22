class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count=0, max=0;
        for(int num:nums){
            int temp = freq.getOrDefault(num, 0)+1;
            freq.put(num, temp);
        
            if(max<temp){
                max=temp;
                count=1;
            }
            else if(max==temp)
                count++;
        }
        return count*max;
    }
}