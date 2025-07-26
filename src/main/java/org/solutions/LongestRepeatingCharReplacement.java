package org.solutions;

public class LongestRepeatingCharReplacement {
    /*
    You are given a string s, and an integer k.
    you can choose any character of the string and change it to any upper-case English character.
    You can perform this operation at most k times.
    Return the length of the longest substring containing the same letter you get after performing the above operation.
    Input: s = “ABAB”  k= 2 Output: 4 Explanation: replace the two “A” with “B” or vice versa.
    Input: s = “AABABBA”  k = 1 Output: 4
Explanation: Replace the one “A” in the middle with “B” and form “AABBBBA”. The substring “BBBB” has the longest repeating letter which is “B”.
     */
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxCount = 0; // this variable to store the maximum repeated letter's repetition count.
        int maxLength = 0;
        int[] charCount = new int[26]; // creating an array of length 26 with 0 value
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right); // storing the current character
            charCount[currentChar - 'A']++; // increase the value at the index of character in alphabet
            maxCount = Math.max(maxCount, charCount[currentChar - 'A']); // updating the max count

            int windowLength = right - left + 1;
            if (windowLength - maxCount > k) {  // it's used to limit the length of the sliding window on the basis of k
                charCount[s.charAt(left) - 'A']--; // dereasing the value at most left char in the window
                left++; // increasing the left to move the sliding window to move to next slide
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
