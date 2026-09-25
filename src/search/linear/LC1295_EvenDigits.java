package search.linear;

public class LC1295_EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 3, 4, 5, 10};
        System.out.println(digitCheck(nums));
    }

    static int digitCheck(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenNumberOfDigits(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean hasEvenNumberOfDigits(int num) {
        int isDigitEven = countDigits(num);
        return isDigitEven % 2 == 0;
    }

    static int countDigits(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
