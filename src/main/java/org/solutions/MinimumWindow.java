package org.solutions;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindow {
    /*
    Given two string s and t of length m and n respectively. return the minimum window substring of s, such that
    every character in s(includes duplicates) is included int the window. If there is no such substring return
    the empty string.
    input: s = "ADOBECODEBANC" t = "ABC"
    Output: "BANC"
    Explanation: the minimum window substring "BANC" includes "A", "B", "C" from the string t
    input: s = "a" t = "a"
    Output: "a"
    
    Explanation: the entire string s is the minimum window
    input: s = "a", t  = "aa"
    Output: ""
    
    Explanation: Both "a" s from t must be included in the window. Since the largest window of s has only one "a"
    return output empty string.
     */
    public String minWindow(String s, String t) {
        int left = 0;
        int minLength = 0;
        Map<Character, Integer> charFrequency = new HashMap<>();
        Map<Character, Integer> windowFrequency = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }
        for (int right = 0; right < s.length(); right++) {
            Character currentChar = s.charAt(right);
            windowFrequency.put(currentChar, windowFrequency.getOrDefault(currentChar, 0) + 1);
            if (right >= t.length()) {

            }
        }

        return "";
    }
}
