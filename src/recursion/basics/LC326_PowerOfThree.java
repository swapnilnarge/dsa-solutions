package recursion.basics;

// Pattern: Basic Recursion (Boolean Return Bubbling)
// Complexity: Time O(log3 n) | Space O(log3 n) [Call Stack Depth]
// Key Trap: Forgetting n % 3 != 0 before integer division (e.g., 4 / 3 truncates to 1 in Java and falsely returns true)
public class LC326_PowerOfThree {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27)); // Expected: true (3^3)
        System.out.println(isPowerOfThree(1));  // Expected: true (3^0)
        System.out.println(isPowerOfThree(4));  // Expected: false
        System.out.println(isPowerOfThree(0));  // Expected: false
    }

    public static boolean isPowerOfThree(int n) {
        // Base Case 1: Reached 3^0 = 1 cleanly
        if (n == 1) {
            return true;
        }
        // Base Case 2: Non-positive or not cleanly divisible by 3
        if (n <= 0 || n % 3 != 0) {
            return false;
        }

        // Recursive Step: Divide by 3 and bubble the boolean result up
        return isPowerOfThree(n / 3);
    }
}