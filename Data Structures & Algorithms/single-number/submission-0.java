class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            int current = nums[i];
            map.put(current,map.getOrDefault(current,0)+1);
        }

        int result = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) result = entry.getKey();
        }

        return result;
    }
}
