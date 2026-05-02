class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0;i < nums.length;i++){
            int curr = nums[i];
            if(curr != val){
                nums[k] = curr;
                k++;
            }
        }

        return k;
    }
}