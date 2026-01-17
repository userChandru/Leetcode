class Solution {
    List<List<Integer>> list;

    public void helper(List<Integer> currList, int[] nums) {
        if (currList.size() == nums.length)
            list.add(new ArrayList<>(currList));
        else 
            for (int i = 0; i < nums.length; i++) {
                if (currList.contains(nums[i]))
                    continue;
                currList.add(nums[i]);
                helper(currList, nums);
                currList.remove(currList.size() - 1);
            }
    }
    public List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<>();
        helper(new ArrayList<>(), nums);
        return list;
    }

}