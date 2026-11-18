package recursion.basics;

// Pattern: Basic Recursion (Bottom-Up Return Accumulation)
// Complexity: Time O(log n) | Space O(log n) [Call Stack Depth]
// Key Trap: Forgetting the base case return value (0) when num reaches 0, or missing how 1 + childResult accumulates as the stack unwinds
public class LC1342_StepsToReduceToZero {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14)); // Expected: 6
        System.out.println(numberOfSteps(8));  // Expected: 4
        System.out.println(numberOfSteps(123)); // Expected: 12
    }

    public static int numberOfSteps(int num) {
        // Base Case: 0 steps needed if num is already 0
        if (num == 0) {
            return 0;
        }

        // Recursive Step: Add 1 step and wait for subproblem result
        if (num % 2 == 0) {
            return 1 + numberOfSteps(num / 2);
        } else {
            return 1 + numberOfSteps(num - 1);
        }
    }
}