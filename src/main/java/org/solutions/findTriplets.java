package org.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findTriplets {

    public List<List<Integer>> findTriplet(int[] inputArray) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 2; i++) {
            if (i > 0 && inputArray[i] == inputArray[i - 1])
                continue;
            int left = i + 1;
            int right = inputArray.length - 1;
            while (left < right) {
                int sum = inputArray[i] + inputArray[left] + inputArray[right];
                if (sum == 0) {
                    result.add(Arrays.asList(inputArray[i], inputArray[left], inputArray[right]));
                    while (left < right && inputArray[left] == inputArray[left + 1]) left++;
                    while (left < right && inputArray[right] == inputArray[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

}
