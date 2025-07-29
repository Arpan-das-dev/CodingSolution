package org.solutions.leetcodeDaily;

import java.util.HashMap;
import java.util.Map;

public class TwoSumI {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumComplements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complements = target - nums[i];
            if (sumComplements.containsKey(complements)) {
                return new int[]{sumComplements.get(complements), i};
            }
            sumComplements.put(nums[i], i);
        }
        return new int[]{};
    }
}
