package org.solutions.leetcodeDaily;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int element : nums) sum += element;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
