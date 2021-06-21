package lc;

// https://leetcode-cn.com/problems/two-sum/

import java.util.HashMap;
import java.util.Map;

public class _1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        if (null == nums) {
            return null;
        }

        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }
            map.put(target - nums[i], i);
        }
        return res;
    }
}
