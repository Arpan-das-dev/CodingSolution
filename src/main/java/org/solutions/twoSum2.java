package org.solutions;
// for sorted and index1 based array 
public class twoSum2 {
    public int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) left++;
            else right--;
        }
        return new int[]{};
    }

}
