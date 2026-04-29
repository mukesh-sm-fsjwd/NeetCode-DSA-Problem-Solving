class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ht = new HashSet<>();

        for(int i = 0;i < nums.length;i++){
            if(ht.contains(nums[i])){
                return true;
            }
            ht.add(nums[i]);
        }
        return false;
    }
}