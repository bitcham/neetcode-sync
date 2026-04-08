class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for(int num : nums){
            if(!numsMap.containsKey(num)){
                numsMap.put(num, 1);
            } else{
                return true;
            }
        }
        return false;
    }
}