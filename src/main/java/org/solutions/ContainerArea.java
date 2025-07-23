package org.solutions;

public class ContainerArea {
    public int containerWithMostWater(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (start < end) {
            int width = (end - start);
            int breadth = Math.min(height[start], height[end]);
            int currentArea = width * breadth;
            maxArea = Math.max(maxArea, currentArea);
            if (height[start] <= height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea; 
    }
}
