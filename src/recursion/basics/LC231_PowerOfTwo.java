package recursion.basics;

// Pattern: Basic Recursion (Boolean Return Bubbling)
// Complexity: Time O(log n) | Space O(log n) [Call Stack Depth]
// Key Trap: Checking n % 2 != 0 before checking n == 1, which falsely rejects 2^0 = 1
public class LC231_PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));  // Expected: true (2^0)
        System.out.println(isPowerOfTwo(16)); // Expected: true (2^4)
        System.out.println(isPowerOfTwo(3));  // Expected: false
        System.out.println(isPowerOfTwo(0));  // Expected: false
    }

    public static boolean isPowerOfTwo(int n) {
        // Base Case 1: Reached 2^0 = 1 cleanly
        if (n == 1) {
            return true;
        }
        // Base Case 2: Non-positive or odd numbers cannot be powers of two
        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        // Recursive Step: Halve n and bubble the boolean result straight up
        return isPowerOfTwo(n / 2);
    }
}