package org.solutions;

import java.util.HashSet;
import java.util.Set;

public class LongestConsequetiveElement {

    public int consequetiveElemnent(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        Set<Integer> unique = new HashSet<>();
        for (int num : arr) {
            unique.add(num);
        }
        int maxStreak = 0;
        for (int element : unique) {
            if (!unique.contains(element - 1)) {
                int currentValue = element;
                int currentStreak = 1;
                while (unique.contains(currentValue + 1)) {
                    currentValue++;
                    currentStreak++;
                }
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }
        return maxStreak;
    }

}
