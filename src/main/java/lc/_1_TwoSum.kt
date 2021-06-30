package lc

import java.util.HashMap

/**
 * https://leetcode-cn.com/problems/two-sum/
 */
object _1_TwoSum {
    fun twoSum(nums: IntArray?, target: Int): IntArray? {
        if (null == nums) {
            return null
        }
        val res = IntArray(2)
        val map: MutableMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            if (map.containsKey(nums[i])) {
                res[0] = map[nums[i]]!!
                res[1] = i
                return res
            }
            map[target - nums[i]] = i
        }
        return res
    }
}