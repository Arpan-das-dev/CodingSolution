package org.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElements {

    public int[] findTopKElements(int[] arr, int k) {

        if (arr == null || arr.length == 0 || k <= 0) {
            return new int[0];
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minToMax = new PriorityQueue<>
                ((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> frequency : frequencyMap.entrySet()) {
            minToMax.offer(frequency);
            if (minToMax.size() > k) {
                minToMax.poll();
            }
        }
        int[] result = new int[k];
        int index = k;
        while (!minToMax.isEmpty()) {
            result[--index] = minToMax.poll().getKey();
        }
        return result;

    }
}
