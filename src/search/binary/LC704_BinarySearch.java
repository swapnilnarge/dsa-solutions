package search.binary;

/**
 * LeetCode #704: Binary Search
 * https://leetcode.com/problems/binary-search/
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class LC704_BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = search(nums, target);
        System.out.println("Target index is: " + result);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // Prevents potential 32-bit integer overflow
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }

        return -1; // Target not found
    }
}