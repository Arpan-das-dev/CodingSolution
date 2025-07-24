package org.solutions;

/*
 given n non-negative integers representing an elevation map where the width of each bar is 1
 compute how much water it can trap after raining
 Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: the above elevation map is represented by array .in this case 6 units of water is trapped
 */
public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[0];
        int rightMax = height[right];
        int total = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                if (leftMax - height[left] > 0) {
                    total = total + leftMax - height[left];
                }
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                if (rightMax - height[right] > 0) {
                    total = total + rightMax - height[right];
                }
                right--;
            }
        }
        return total;
    }
}
