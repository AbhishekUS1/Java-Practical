package Practicals.Leetcode;

public class ex1 {
    public static void main(String[] args) {
        // Example usage:
        int[] nums = { 2, 7, 11, 15 };
        int target = 13;

        int[] result = twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println(
                    "Indices of the two numbers that add up to the target: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
