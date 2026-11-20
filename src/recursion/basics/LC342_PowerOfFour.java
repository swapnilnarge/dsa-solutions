package recursion.basics;

// Pattern: Basic Recursion (Boolean Return Bubbling)
// Complexity: Time O(log4 n) | Space O(log4 n) [Call Stack Depth]
// Key Trap: Copy-pasting n % 2 != 0 instead of n % 4 != 0, which lets numbers like 2 or 8 pass the modulo check
public class LC342_PowerOfFour {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16)); // Expected: true (4^2)
        System.out.println(isPowerOfFour(1));  // Expected: true (4^0)
        System.out.println(isPowerOfFour(8));  // Expected: false
        System.out.println(isPowerOfFour(5));  // Expected: false
    }

    public static boolean isPowerOfFour(int n) {
        // Base Case 1: Reached 4^0 = 1 cleanly
        if (n == 1) {
            return true;
        }
        // Base Case 2: Non-positive or not cleanly divisible by 4
        if (n <= 0 || n % 4 != 0) {
            return false;
        }

        // Recursive Step: Divide by 4 and bubble the boolean result up
        return isPowerOfFour(n / 4);
    }
}