package search.linear;
/**
 * LeetCode #1672: Richest Customer Wealth
 * https://leetcode.com/problems/richest-customer-wealth/
 * Time Complexity: O(M x N)
 * Space Complexity: O(1)
 */
public class LC1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}};
        int result = maximumWealth(accounts);
        System.out.println("The maximum Wealth is:" + result);
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int money : customer) {
                currentWealth += money;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
}
