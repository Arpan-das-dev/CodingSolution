package org.solutions.leetcodeDaily;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public int findDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            if (uniqueSet.contains(num)) return num;
            uniqueSet.add(num);
        }
        return 0;
    }
}
