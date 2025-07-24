package org.solutions;

public class ValidPalindrome {
    public boolean isValidPalindrome(String s) {
        if (s.isEmpty()) return false;
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            Character leftChar = Character.toLowerCase(s.charAt(left));
            Character rightChar = Character.toLowerCase(s.charAt(right));
            if (leftChar != rightChar) return false;
            left++;
            right--;
        }
        return true;
    }
}
