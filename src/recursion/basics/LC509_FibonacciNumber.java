package recursion.basics;

// Pattern: Basic Recursion (Branching / Call Stack)
// Complexity: Time O(2^n) | Space O(n) [Call Stack Depth]
// Key Trap: Confusing index 'n' with value F(n); left branch resolves completely before right branch starts

public class LC509_FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(4)); // Expected: 3
        System.out.println(fib(6)); // Expected: 8
    }

    public static int fib(int n) {
        // Base Case: F(0) = 0, F(1) = 1
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive Step: sum of the two preceding Fibonacci numbers
        return fib(n - 1) + fib(n - 2);
    }
}
