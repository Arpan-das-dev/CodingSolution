package org.solutions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    /* Given a string s, find the length of the longest substring without repeating characters
     input: s = "abcabcbb" output: 3
     explanation: "the answer is "abc", with the length of 3;
     input: s = "bbbbb" output: 1
     explanation: the answer is 'b', with the length of 1;
     input: s = "pwwkew" output: 3
     explanation: the answer is "wke", with the length of 3;
     */
    public int longestSubStringLength(String s) {
        int left = 0;
        int maxLength = 0;
        Set<Character> seen = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            Character currentChar = s.charAt(right);
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(currentChar);
            int currentLength = (right - left) + 1;
            maxLength = Math.max(currentLength, maxLength);
        }
        return maxLength;
    }
}
