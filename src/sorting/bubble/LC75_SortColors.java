package sorting.bubble;

import java.util.Arrays;

/**
 * LeetCode #75: Sort Colors
 * https://leetcode.com/problems/sort-colors/
 * Approach: Bubble Sort (In-place)
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class LC75_SortColors {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before: " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("After:  " + Arrays.toString(nums)); // Output: [0, 0, 1, 1, 2, 2]
    }

    public static void sortColors(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}