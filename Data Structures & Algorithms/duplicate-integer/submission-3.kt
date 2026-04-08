class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val compare = mutableSetOf<Int>()
        for (num in nums){
            if(compare.contains(num)){
                return true
            }
            compare.add(num)
        }
        return false
    }
}
