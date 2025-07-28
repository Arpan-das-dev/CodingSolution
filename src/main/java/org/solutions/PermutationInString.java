package org.solutions;

public class PermutationInString {
    /*
    Given two string s and t, return true if t contains a permutation of t
    or false otherwise. In other words if s's permutation is a substring of t.
    Input: s = "ab" t = "eidbaooo"
    Output:true
    Explanation: One permutation of "ab" is "ba", which is a substring of "eidbaooo".

    Input: s = "abc" t = "ccccbbbbaaaa"
    Output: false
    Explanation: None of the permutations of "abc" appear as a substring in t.

    Input: s = "adc" t = "dcda"
    Output: true
    Explanation: One of the permutations of "adc" is "dca", and "dca" is a substring of "dcda"
    starting at index 1.
     */
    public boolean hasPermutation(String s, String t) {
        if (s.length() > t.length()) return false;
        int[] sFrequency = new int[26];
        int[] windowFrequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sFrequency[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            windowFrequency[t.charAt(i) - 'a']++;
            if (i >= s.length()) {
                windowFrequency[t.charAt(i - s.length()) - 'a']--;
            }
            if (matches(sFrequency, windowFrequency)) return true;
        }
        return false;
    }

    public boolean matches(int[] s1, int[] s2) {
        for (int i = 0; i < 26; i++) {
            if (s1[i] != s2[i]) return false;
        }
        return true;
    }
}
