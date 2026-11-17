package recursion.basics;

import java.util.Arrays;

// Pattern: Recursive Two-Pointers (Helper Method State Passing)
// Complexity: Time O(n) | Space O(n) [Call Stack Depth]
// Key Trap: LeetCode's void signature lacks left/right indices; pass changing window boundaries via a helper method
public class LC344_ReverseString {

    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println(Arrays.toString(s1)); // Expected: [o, l, l, e, h]

        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println(Arrays.toString(s2)); // Expected: [h, a, n, n, a, H]
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }

    private static void helper(char[] s, int left, int right) {
        // Base Case: Pointers meet or cross
        if (left >= right) {
            return;
        }

        // Swap outer characters in-place
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // Recursive Step: Move window inward
        helper(s, left + 1, right - 1);
    }
}