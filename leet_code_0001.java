// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (hash.containsKey(comp)) {
                int[] ind = {hash.get(comp), i};
                return ind;
            }
            hash.put(nums[i], i);
        }
    }
}
