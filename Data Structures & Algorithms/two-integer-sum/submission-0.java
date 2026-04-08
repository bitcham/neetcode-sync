class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> targetCal = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length;i++){
            int key = target - nums[i];
            if(targetCal.containsKey(key)){
                result[0] = targetCal.get(key);
                result[1] = i;
                return result;
            }
            targetCal.put(nums[i], i);
        }
        return result;
    }
}
